package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class Bookstore {

	public static void main(String[] args) throws SQLException {
		MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/books");
		ds.setUser("root");
		ds.setPassword("vvv999");
		Connection connection = null;
		CallableStatement cbst = null;
		ResultSet result = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id = scan.nextInt();
		String query = "{call Bookstore(?)}";
		try {
			 connection = ds.getConnection();
			if(connection!=null) {
				cbst = connection.prepareCall(query);
			}
			if(cbst!=null){
				cbst.setInt(1, id);
				cbst.execute();
				
				result = cbst.getResultSet();
				if(result!=null) {
					if(result.next()) {
					int Bno =	result.getInt(1);
					String Bn =	result.getString(2);
					String Bt = result.getString(3);
					System.out.println(Bno+"\t"+Bn+"\t"+"\t"+Bt+"\t");
					}
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(result!=null) {
				result.close();
			}
			if(cbst!=null) {
				cbst.close();
			}
			if(connection!=null) {
				connection.close();
			}
		}
		
		
		

	}

}
