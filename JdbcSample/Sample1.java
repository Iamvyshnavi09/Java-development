package JdbcSample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;
public class Sample1 {

	public static void main(String[] args) throws SQLException {
		/* step1: load and register the driver */
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);

		/* step 2: Establish the connection between java to database */
		String url = "jdbc:mysql://localhost:3306/fruits";
		String username = "root";
		String password = "vvv999";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		/* step3:Create a statement object */
		Statement statement = connection.createStatement();
		/* step 4:Send and Execute the query */
		String query = "Select fno,fname,fseason from fruits";

		/* step 5:Process and result from result set */
		ResultSet result = statement.executeQuery(query);
		while (result.next()) {
			int fno = result.getInt(1);
			String fname = result.getString(2);
			String fseason = result.getString(3);
			System.out.println(fno + "\t" + fname + "\t" + fseason + "\t");
		}
		/*step 6:close the connection*/
		result.close();
		statement.close();
		connection.close();
		}
	}
