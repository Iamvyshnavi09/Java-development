package Date;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import Sever.Server1;

public class Retrivedata {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement pmst = null;
		ResultSet result = null;
		System.out.println("Hai every one");
		System.out.println("Here the details of Employee ");
		String query = "select Empid,Ename,Edob,Edoj from empdetails";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
			}
			if (pmst != null) {
				result = pmst.executeQuery();
			}
			if (result != null) {
				System.out.println("Empid\tEname\tEdob\t\tEDoj ");
				while (result.next()) {

					int Empid = result.getInt(1);
					String name = result.getString(2);
					Date d1 = result.getDate(3);
					Date d2 = result.getDate(4);
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String dob = sdf.format(d1);

					String doj = sdf.format(d2);
					System.out.println(Empid + "\t" + name + "\t" + d1 + "\t" + d2);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception v) {
			v.printStackTrace();

		} finally {
			if (result != null) {
				result.close();
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
