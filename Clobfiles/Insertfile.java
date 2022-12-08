package Clobfiles;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

import Sever2.Server1;

public class Insertfile {

	public static void main(String[] args) throws ParseException {
		Connection connection = null;
		PreparedStatement pmst = null;
		System.out.println("History of places");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sno:");
		int sno = scan.nextInt();
		System.out.println("Enter the location:");
		String loc = scan.next();
		System.out.println("Enter the date");
		String date = scan.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate = sdf.parse(date);
		long l = udate.getTime();
		java.sql.Date sdate = new java.sql.Date(l);

		String query = "insert into data (`sno`,`location`,`history`,`date`)values(?,?,?,?)";
		try {
			connection = Server1.getconnection();
			if (connection != null)

				pmst = connection.prepareStatement(query);
			if (pmst != null) {
				pmst.setInt(1, sno);
				pmst.setString(2, loc);
				String file = "Dairy.txt";
				File f = new File(file);
				FileReader fr = new FileReader(f);
				pmst.setCharacterStream(3, fr);
				pmst.setDate(4, sdate);
				int rows = pmst.executeUpdate();
				if (rows > 0) {
					System.out.println(loc + "" + "History file is instered");
				} else {
					System.out.println(loc + "" + "History file is not instered");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}
}
