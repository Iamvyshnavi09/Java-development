package JdbcSample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
public class Altertable {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
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
				int n = statement.executeUpdate("ALTER TABLE fruits ADD Design VARCHAR(50)");
				if(n==1) {
				System.out.println("Add Column successfully");
				}
			}

		} catch (SQLException e) {

		} catch (Exception v) {

		} finally {

			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}
}
