package Multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
	static int n, sum = 0;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sum of first n numbers");
		System.out.println("Enter a value");
		Scanner s = new Scanner(System.in);
		JoinDemo.n = s.nextInt();
		JoinDemo jd = new JoinDemo();
		jd.start();
		jd.join();
		System.out.println("Sum of first " + JoinDemo.n + " numbers is " + JoinDemo.sum);
		s.close();
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
	

}
