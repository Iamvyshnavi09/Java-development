package Multithreading;



public class Sample1 extends Thread{
	@Override
	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("I am a thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Got Interrupted");
		}

	}

	public static void main(String[] args) {
		Sample1 t = new Sample1();
		t.start();

		//t.interrupt();

		System.out.println("End of the main method");
	

	}

}
