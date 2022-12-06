package PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Sever.Server;
public class Insert {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pmst = null;
		System.out.println("Hai welcome to Book Store ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Book number");
		int Bno = scan.nextInt();
		System.out.println("Enter your Book name");
		String Bname = scan.next();
		System.out.println("Enter your Book type ");
		String Btype = scan.next();
		String query = "insert into Books(`Bno`,`Bname`,`Btype`) values (?,?,?)";
		try {
			connection = Server.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					pmst.setInt(1, Bno);
					pmst.setString(2, Bname);
					pmst.setString(3, Btype);
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
