package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Sever.Server1;

public class Detailsinsert {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pmst = null;
		System.out.println("Hai welocome to login page");
		
		System.out.println("Enter the user name ");

		Scanner scan = new Scanner(System.in);
		String us = scan.next();
		System.out.println("Enterthe password ");
		String up = scan.next();
		String query = "insert into login (`username`,`Password`)values(?,?)";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				pmst.setString(1, us);
				pmst.setString(2, up);
				int rowsAffected = pmst.executeUpdate();
				if (rowsAffected > 0) {
					System.out.println("login succesfully completed");
				} else {
					System.out.println("wrong username and password");
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception v) {
			v.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
			}
			if (pmst != null) {
				pmst.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

	}

}
