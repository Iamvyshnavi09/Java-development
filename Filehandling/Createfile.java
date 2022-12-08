package Filehandling;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) throws IOException {
		try {
		File file = new File("DemoJava.txt");
		File file1 = new File("C:\\Users\\TEMP\\Documents\\Sample.java");
		if(file.createNewFile()) {
			System.out.println("File created : "+file.getName());
			System.out.println("File absolute path : "+file.getAbsolutePath());
		}else {
			System.out.println("File Alresy exits: "+file1.getName());
		}
		}
		catch(IOException e) {
			System.out.println("An Error occur");
			e.printStackTrace();
			
		}
	}

}
