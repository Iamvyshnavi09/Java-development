package Multithreading;

public class Demo2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Happy newyear ");
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


	


