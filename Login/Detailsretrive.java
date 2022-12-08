package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Sever.Server1;

public class Detailsretrive {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pmst = null;
		ResultSet result = null;
		System.out.println("Hai welocome to login page");
		System.out.println("Here is the the details ");
		String query = "select * from login";
		try (Connection connection1 = Server1.getconnection();
				PreparedStatement pmst1 = connection1.prepareStatement(query)) {
			try (ResultSet result1 = pmst1.executeQuery(query)) {
				if (result1 != null) {
					System.out.println("username\tPassword");
					while (result1.next()) {
						String us = result1.getString(1);
						String up = result1.getString(2);
						System.out.println(us + "\t" + up + "\t");
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception v) {
			v.printStackTrace();

		} finally {

			if (pmst != null) {
				pmst.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}
}
