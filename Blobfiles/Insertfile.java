package Blobfiles;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Sever2.Server1;

public class Insertfile {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pmst = null; 
		ResultSet result = null;
		System.out.println("Enter to insert name of file");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String query = "insert into photos (`name`,`image`)values(?,?)";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					pmst.setString(1, name);
					File f = new File("Vaishu.png");
					FileInputStream fis = new FileInputStream(f);
					pmst.setBlob(2, fis);
					int rowsAffected = pmst.executeUpdate();
					if (rowsAffected > 0) {
						System.out.println("Number of insert file: " + rowsAffected);
					} else {
						System.out.println("Not inserted file");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
			}
			Server1.closeConnection(connection, pmst, result);

		}

	}

}
