package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> birds = new ArrayList<String>();
	    birds.add("peacock");
	    birds.add("parrot");
	    birds.add("sparrow");
	    birds.add("Kiwi");
	    System.out.println(birds);
	    birds.set(3, "dove");
	    System.out.println(birds);
	    birds.remove("Mango");
	    System.out.println(birds);
		ListIterator i = birds.listIterator();// List iterator method gives list of items in forward and backward
		while (i.hasNext())
			System.out.print(i.next() + " "); //forward elements
		System.out.println();
		
		while (i.hasPrevious()) {			//backward elements

			System.out.print(i.previous() + " ");

			System.out.println();

	    }
	  }
	

	}


