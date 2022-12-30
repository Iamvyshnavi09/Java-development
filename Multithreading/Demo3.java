package Multithreading;

public class Demo3 {
	public static void main(String[] args) {
		Runnable obj1 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Happy");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		};
		Runnable obj2 = () -> {
			for (int i = 0; i < 5; i++) {

				System.out.println("Maya");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}

			}
		};

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
