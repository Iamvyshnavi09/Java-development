package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("manas");  
		  al.add("maya");  
		    System.out.println(al);
		    System.out.println("forward traverse elements"); 
		  Iterator<String> itr=al.iterator();  // forward Traversing elements
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  System.out.println("Backward traverse elements");
		  Iterator i=al.iterator();  //Backward traverse elements
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	           
		 }  
		 

	}


