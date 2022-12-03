package JdbcSample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class Displaytable {
public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		String url = "jdbc:mysql://localhost:3306/fruits";
		String username = "root";
		String password = "vvv999";
		try {
			Driver driver = new Driver();
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				statement = connection.createStatement();
			}
			if (statement != null) {
				String query = "Select fno,fname,fseason from fruits";
				result = statement.executeQuery(query);
				while (result.next()) {
					int fno = result.getInt(1);
					String fname = result.getString(2);
					String fseason = result.getString(3);
					System.out.println(fno + "\t" + fname + "\t" + fseason + "\t");
				}

			}
		} catch (SQLException e) {

		} catch (Exception v) {

		} finally {
			if (result != null) {
				result.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

	}

}
