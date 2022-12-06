package PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Sever.Server;

public class Update {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pmst = null;
		System.out.println("Hai Welcome to book Store");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your updated Book name");
		String Bname = scan.next();
		System.out.println("Enter Book number");
		int Bno = scan.nextInt();
		String query = "update Books set Bname=? where Bno=?";
		try {
			connection = Server.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {

					pmst.setString(1, Bname);
					pmst.setInt(2, Bno);

					int rowsAffected = pmst.executeUpdate();
					System.out.println(rowsAffected);
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
