package Sever;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Server {

	public static Connection getconnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Books";
		String username = "root";
		String password = "vvv999";
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
		}
	public void closeConnection(Connection connection,PreparedStatement pmst,ResultSet result) {
		
		
	}

}
