package Blobfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import Sever2.Server1;

public class Retrivedemo {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pmst = null;
		ResultSet result = null;

		String query = "select name,image from photos where name=?";
		try {
			connection = Server1.getconnection();
			if (connection != null) {
				pmst = connection.prepareStatement(query);
				if (pmst != null) {
					pmst.setString(1, "Smiley");
					result = pmst.executeQuery();
					if (result.next()) {
						String name = result.getString(1);
						InputStream is = result.getBinaryStream(2);
						File file = new File("Vaishu.png");
						FileOutputStream fos = new FileOutputStream(file);
						IOUtils.copy(is, fos);

						System.out.println("image downloaded ");

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
