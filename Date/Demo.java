package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws ParseException {
		java.util.Date d = new Date(); /* return both time and date */
		System.out.println(d);
		long l = d.getTime(); /* date in long format */
		System.out.println(l);
		java.sql.Date j = new java.sql.Date(l); /* convert long into date format not include time */
		System.out.println(j);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); /* for changing format */
		String d1 = sdf.format(j);
		System.out.println(d1);

		/* using scanner class */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date");
		String userinput = scan.next();
		System.out.println(userinput);
		Date date = sdf.parse(userinput); /* We can convert String to Date in java using parse() method */
		System.out.println(date);
		long ll = date.getTime();
		System.out.println(ll);
		java.sql.Date j1 = new java.sql.Date(ll);
		System.out.println(j1);
		scan.close();

	}

}
