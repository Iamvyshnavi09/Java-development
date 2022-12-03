package JdbcSample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
public class Insertquery {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
			String url = "jdbc:mysql://localhost:3306/fruits";
			String username = "root";
			String password = "vvv999";
			try {
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				connection  = DriverManager.getConnection(url, username, password);
				
			if (connection != null) {
				statement = connection.createStatement();
			}
			if (statement != null) {
				String insertQuery = "insert into fruits(`fno`,`fname`,`fseason`) values (5,'Greenapple','Winter')";
			 int rowsAffected = statement.executeUpdate(insertQuery);
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
