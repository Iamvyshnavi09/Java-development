package Clobfiles;

import java.io.File;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import Sever2.Server1;

public class Retrivefile {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pmst = null;
		ResultSet result = null;
		
		String query = "select * from data where sno= ?";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					pmst.setInt(1, 1);
					
					result = pmst.executeQuery();
					if (result != null) {
						if (result.next()) {
							Reader fr = result.getCharacterStream(2);
							File f = new File("TPT.txt");
							FileWriter fW = new FileWriter(f);
							IOUtils.copy(fr, fW);
							System.out.println("File downloaded");
							System.out.println("File location:" + f.getAbsolutePath());
						} else {
							System.out.println("no file downloaded");
						}

					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			Server1.closeConnection(connection, pmst, result);
		}

	}

}
