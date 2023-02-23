package Lamdaexp;

import java.util.ArrayList;

public class SampleLambda {
	public static void main(String[] args) {
	    ArrayList<Integer> num = new ArrayList<Integer>();
	    num.add(5);
	    num.add(9);
	    num.add(8);
	    num.add(1);
	    num.forEach( (n) -> { System.out.println(n); } );
	  }
}
