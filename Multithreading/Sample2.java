package Multithreading;

public class Sample2 {
	
		public static void main(String[] args) {
			Runnable obj1 = new Demo2();
			Runnable obj2 = new Stars();
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
