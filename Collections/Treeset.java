package Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class Treeset {
	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("Maya");
		al.add("Karthik");
		al.add("Abi");
		al.add("Vishnu");
		System.out.println("Treeset elements : " + al);

		System.out.println("forward traverse elements");
		System.out.println("-------------------------");
		Iterator<String> itr = al.iterator(); // forward Traversing elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Iterator<String> iterator = al.descendingIterator();// getting the reverse order view of element using descendingSet() method Backward traversing elements
		System.out.println("Backward traverse elemnts:");
		System.out.println("-------------------------");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		String check = "Vishnu";
		System.out.println("--------------------------");
		System.out.println("Contains " + check + " " + al.contains(check));
		System.out.println("First Element " + al.first());

		String val = "Karthik";
		System.out.println("Higher " + al.higher(val));
		System.out.println("Lower " + al.lower(val));
		al.remove("Vishnu");
		System.out.println("Removing elements :" + al);
	}

}
