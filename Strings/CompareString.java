package Strings;

public class CompareString {

	public static void main(String[] args) {
		String s1 = "Helloworld"; /* store in string pool */
		String s2 = new String("Helloworld"); /* store in heap memory */
		
		if (s1 == s2) {
			System.out.println("Both strings are same: "+s1+" "+s2);
		}
															/* compare the address*/
		else {
			System.out.println("Both Strings are not same: "+s1+" "+s2);
		}
		
		System.out.println(s1==s2);
		
		
		if (s1.equals(s2)) {
			System.out.println("Both strings are same: "+s1+" "+s2);
		}													/*compare the text*/

		else {
			System.out.println("Both Strings are not same: "+s1+" "+s2);
		}
		System.out.println(s1.equals(s2));
	}

}
