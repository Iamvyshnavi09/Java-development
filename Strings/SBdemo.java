package Strings;

public class SBdemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("Initial Capacity: " + sb.capacity());

		sb.append("Hello world");
		sb.append("Learning java");

		System.out.println(sb);

		System.out.println("Current Capacity: " + sb.capacity());

		System.out.println("charAT: " + sb.charAt(10));

		StringBuffer sb1 = new StringBuffer("Super");
		System.out.println(sb1.reverse());

		System.out.println(sb1.insert(3, "nice"));
		System.out.println(sb1.delete(3, 6));
	}

}
