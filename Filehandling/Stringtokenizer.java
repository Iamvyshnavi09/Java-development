package File;

import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		String s = " Do,work,not,think,about,result";
		String S = " Do work not think about result";
		StringTokenizer str = new StringTokenizer(s, ",",true);
	
		StringTokenizer str1 = new StringTokenizer(S);
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		while (str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}

	}

}
