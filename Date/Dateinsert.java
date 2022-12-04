package Date;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Sever.Server1;

public class Dateinsert {

	public static void main(String[] args) throws SQLException, ParseException {
		Connection connection = null;
		PreparedStatement pmst = null;
		System.out.println("Hai every one");
		System.out.println("Enter the Employee details to insert ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee id");
		int Empid = scan.nextInt();
		System.out.println("Enter Employee name");
		String Ename = scan.next();
		System.out.println("Enter Employee date of brith");
		String dob = scan.next();
		System.out.println("Enter Employee date of joining");
		String doj = scan.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date ud = sdf.parse(dob);
		long l = ud.getTime();
		java.sql.Date dob1 = new java.sql.Date(l);
		java.util.Date ud1 = sdf.parse(doj);
		long ll = ud.getTime();
		java.sql.Date doj1 = new java.sql.Date(ll);
		String query = "insert into empdetails(`Empid`,`Ename`,`Edob`,`Edoj`)values(?,?,?,?)";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					pmst.setInt(1, Empid);
					pmst.setString(2, Ename);

					pmst.setDate(3, dob1);
					pmst.setDate(4, doj1);
					int rowsAffected = pmst.executeUpdate();
					System.out.println("Rows Affected :" + rowsAffected);
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
