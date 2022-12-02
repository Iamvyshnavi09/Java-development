package Multithreading;

public class Demo2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Happy");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Stars implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Maya");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class Desp {
	public static void main(String[] args) {
		Runnable obj1 = new Demo2();
		Runnable obj2 = new Mars();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t2.start();

	}

}
