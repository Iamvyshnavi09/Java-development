package Multithreading;

public class Sample {
	
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
