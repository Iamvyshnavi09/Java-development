package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Scanner;

import Sever.Server1;

public class DetailsDelete {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pmst = null;
		System.out.println("Hai welocome to login page ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username");
		String US = scan.next();

		String query = "delete from login where username = ?";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					pmst.setString(1, US);
					int rowsAffected = pmst.executeUpdate();
					if (rowsAffected > 0) {
						System.out.println("username is deleted:" + rowsAffected);
					} else {
						System.out.println("username is not deleted");
					}

				}

			}
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception v) {
			v.printStackTrace();
		} finally {

			Server1.closeConnection(connection, pmst, null);
			if (scan != null) {
				scan.close();
			}
		}
	}

}
