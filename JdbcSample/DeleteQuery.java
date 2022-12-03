package JdbcSample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
public class DeleteQuery {
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
				String query = "Delete from fruits where fno = 1";
				int rowsAffected = statement.executeUpdate(query);
				System.out.println(rowsAffected);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
