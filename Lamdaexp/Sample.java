package Lamdaexp;

public class Sample {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {

			for (int i = 0; i <= 5; i++) {
				System.out.println("Anynomous class");
			}

		});
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Lambda expresions");
		}

	}

}
