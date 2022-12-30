package Collections;

import java.util.LinkedHashSet;
import java.util.Random;

public class Linkedhashset1 {

	public static void main(String[] args) {
		Random r = new Random();
		LinkedHashSet<Integer>set = new LinkedHashSet<>();
		for(int i = 1;i<=10;i++) {
			int number = r.nextInt(20);
			set.add(number);
			System.out.println(number);
			}
			System.out.println("LinkedHashSet : "+set);
		}
	}


