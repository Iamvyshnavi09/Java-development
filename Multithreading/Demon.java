package Multithreading;

public class Demon {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon()); // Here main thread is not Demon thread
		Mythread my = new Mythread(); // child thread is not Demon thread
		
		System.out.println(my.isDaemon());
		my.start();

	}

}
