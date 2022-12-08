package Strings;

import java.util.Scanner;

public class ConcatStrings {

	public static void main(String[] args) {
		String s1 = "Today is a ";
		String s2 = new String("Hoilyday");
		System.out.println("Concatination of the strings will be:");
		System.out.println(s1+s2);
		/*using scanner class by creating new keyword*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first string:");
		String str = scan.next();
		System.out.println("Enter your secong string:");
		String str1 = scan.next();
		System.out.println("The conactinated string be:"+""+str+str1);
		scan.close();
		
	}

}
