package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Beautiful");
		hs.add("Adventures");
		hs.add("Danger");
		hs.add("Energy");
		hs.add("Congratulations");
		hs.add("Formula");

		System.out.println("Size of LinkedHashSet : " + hs.size());
		System.out.println("Original LinkedHashSet :" + hs);
		System.out.println("Removing FormulaLinkedHashSet : " + hs.remove("Formula"));
		System.out.println("Remove Z which is not present : " + hs.remove("Z"));
		Iterator<String> setIterator = hs.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		System.out.println("Checking Energy is present : " + hs.contains("Energy"));
		System.out.println("Updated LinkedHashSet : " + hs);

	}

}
