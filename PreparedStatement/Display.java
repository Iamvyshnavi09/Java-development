package PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Sever.Server;
public class Display {
public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pmst = null;
		ResultSet result = null;
		System.out.println("Hai welcome to Book Store ");
		String query = "select Bno,Bname,Btype from Books";
		try {
			connection = Server.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {

					result = pmst.executeQuery(query);
					while (result.next()) {
						int Bno = result.getInt(1);
						String Bname = result.getString(2);
						String Btype = result.getString(3);
						System.out.println(Bno + "\t" + Bname + "\t" + " " + "\t" + Btype + "\t");
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
