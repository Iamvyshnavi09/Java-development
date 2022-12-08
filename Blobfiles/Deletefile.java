package Blobfiles;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

import Sever2.Server1;

public class Deletefile {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pmst = null;
		System.out.println("Enter to insert name of file");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String query = "delete from photos where name = ?";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					pmst.setString(1, name);
				}
				int result_set = pmst.executeUpdate();
				if (result_set > 0) { 
					System.out.println("Deleted");
				} else {
					System.out.println("Can't delete");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
			}
			Server1.closeConnection(connection, pmst, null);
		}

	}

}
