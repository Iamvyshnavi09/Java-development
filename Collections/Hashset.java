package Collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> items = new HashSet<String>();
		items.add("laptop");
		items.add("mobile");
		items.add("Switch board");
		items.add("mac book");
		items.add("charger");
		System.out.println(items);
		System.out.println(items.contains("mac book"));
		System.out.println(items.size());

		if (items.contains("mobile")) {
			System.out.println("mobile was found in the set.");
		} else {
			System.out.println("mobile was not found in the set.");
		}
	}
}
		
	


