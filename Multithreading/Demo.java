package Multithreading;

public class Demo extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Rainbow");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Mars extends Demo {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("colour");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}



