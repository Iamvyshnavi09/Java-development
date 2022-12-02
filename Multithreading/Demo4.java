package Multithreading;

public class Demo4 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
		for (int i = 0; i < 5; i++) {
			System.out.println("Happy");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
	}
	});
		Thread t2 = new Thread(()->{
		for (int i = 0; i < 5; i++) {

			System.out.println("Movie");
			try {
				Thread.sleep(1000);
			} catch (Exception e1) {}

		}
	});

		t1.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();	
}

	
	}


