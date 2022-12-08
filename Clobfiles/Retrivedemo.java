package Clobfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;

import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import Sever2.Server1;

public class Retrivedemo {

	public static void main(String[] args) throws ParseException {
		Connection connection = null;
		PreparedStatement pmst = null;
		ResultSet result = null;
		System.out.println("History of places");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sno");
		int sno = scan.nextInt();
		String query = "Select sno,location,history,date from data";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					result = pmst.executeQuery(query);

					if (result != null) {
						if (result.next()) {
							Reader fr = result.getCharacterStream(3);
							File f = new File("History.txt");
							FileWriter fw = new FileWriter(f);
							IOUtils.copy(fr, fw);
							fw.flush();

							System.out.println("File downloaded");
							System.out.println("File location:" + f.getAbsolutePath());
						} else {
							System.out.println("no file downloaded");
						}

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
				Server1.closeConnection(connection, pmst, result);
			}
		}
	}

}
