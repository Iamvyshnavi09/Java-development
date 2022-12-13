package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\hp\\Downloads\\Butterfly.png");
			fos = new FileOutputStream("C:\\Users\\hp\\Downloads\\Blue.png");
			int data;
			while ((data = fis.read()) != -1) {

			}

			System.out.println("Photo is copied ");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			fis.close();
			fos.close();
		}

	}

}
