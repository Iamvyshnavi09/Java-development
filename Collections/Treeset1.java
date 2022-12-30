package Collections;


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer>set = new TreeSet<>();
		for(int i = 1;i<=10;i++) {
			int number = r.nextInt(15);
			set.add(number);
			System.out.println(number);
			}
		System.out.println("TreeSet elements : "+set);

	}

}
