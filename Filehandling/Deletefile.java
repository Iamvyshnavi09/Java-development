package Filehandling;

import java.io.File;


public class Deletefile {

	public static void main(String[] args) {
		 
			 File fs = new File("C:\\Users\\TEMP\\Documents\\Demo.txt"); 
			    if (fs.delete()) { 
			      System.out.println("Deleted the file: " + fs.getName());
			    } else {
			      System.out.println("Failed to delete the file.");
			    } 
		 
	}
}


