package Collections;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String, String> books = new TreeMap<String, String>();
		books.put("FF", "Fantasy"); // Add keys and values (names, types)
		books.put("FG", "General");
		books.put("FI", "Inspirational");
		books.put("FS", " Sports");
	    System.out.println(books);
	    System.out.println(books);
	    books.get("England");
	    System.out.println(books.size());
	   
	    for (String i : books.keySet()) {  /*print keys*/
	      System.out.println(i);
	    }
	  
	for (String i : books.keySet()) {
		  System.out.println("key: " + i + " value: " + books.get(i)); /*print values*/
		}
	}
	
	

}