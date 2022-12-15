package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Rowset {

	public static void main(String[] args) throws SQLException, IOException {
		RowSetFactory factory = RowSetProvider.newFactory();
		JdbcRowSet jr = factory.createJdbcRowSet();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src//properties//properties");
		prop.load(fis);
		jr.setUrl(prop.getProperty("URL"));
		jr.setUsername(prop.getProperty("Username"));
		jr.setPassword(prop.getProperty("Password"));
		jr.setCommand("select*from student");
		jr.execute();
		System.out.println("Forward formate");
		System.out.println("===============");
		System.out.println("Sname\tSage");
		if (jr != null) {
			while (jr.next()) {
				System.out.println(jr.getString(1) + "\t" + jr.getInt(2));
			}

		}
		System.out.println("Reverse formate");
		System.out.println("===============");
		System.out.println("Sname\tSage");
		if (jr != null) {
			while (jr.previous()) {
				System.out.println(jr.getString(1) + "\t" + jr.getInt(2));
			}

		}

	}

}
