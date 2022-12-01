package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
	    fruits.add("Apple");
	    fruits.add("Pineapple");
	    fruits.add("Mango");
	    fruits.add("kiwi");
	    System.out.println(fruits);
	    fruits.addFirst("Guava");
	    System.out.println(fruits);
	    fruits.remove("Mango");
	    System.out.println(fruits);
		ListIterator i = fruits.listIterator();// List iterator method gives list of items in forward and backward
		while (i.hasNext())
			System.out.print(i.next() + " "); //forward elements
		System.out.println();
		
		while (i.hasPrevious()) {			//backward elements

			System.out.print(i.previous() + " ");

			System.out.println();

	    }
	  }
	}