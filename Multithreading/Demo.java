package Multithreading;

public class Demo extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Vaishnavi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Mars extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Mars");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class Memo {
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		Mars obj2 = new Mars();
		obj1.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		obj2.start();

	}

}
