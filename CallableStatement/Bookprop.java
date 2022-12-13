package CallableStatement;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import java.util.Properties;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class Bookprop {

	public static void main(String[] args) throws IOException {
		MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src//jdbcprop//jdbc.properties");
		prop.load(fis);
		ds.setUrl(prop.getProperty("Url"));
		ds.setUser(prop.getProperty("Username"));
		ds.setPassword(prop.getProperty("Password"));
		String query = "{call Bookstore()}";
		try {
			Connection connection = null;
			CallableStatement cbst = null;
			ResultSet result = null;
		
			 connection = ds.getConnection();
			if(connection!=null) {
				 cbst = connection.prepareCall(query);
			}
			if(cbst!=null){
				cbst.execute();
				result = cbst.getResultSet();
				if(result!=null) {
					while(result.next()) {
					int Bno =	result.getInt(1);
					String Bn =	result.getString(2);
					String Bt = result.getString(3);
					System.out.println(Bno+"\t"+Bn+"\t"+"\t"+Bt+"\t");
					}
				}
				
			}

	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}
	

}
