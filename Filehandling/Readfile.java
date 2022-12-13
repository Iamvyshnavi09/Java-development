package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) {
		try {
		      File file = new File("C:\\Users\\TEMP\\Documents\\Sample.java");
		      System.out.println("File absolute path : "+file.getAbsolutePath());
		      System.out.println("File name : "+file.getName());
		      Scanner Reader = new Scanner(file);
		      while (Reader.hasNextLine()) {
		        String data = Reader.nextLine();
		        System.out.println(data);
		      }
		      Reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
