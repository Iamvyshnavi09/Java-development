package Lamdaexp;

@FunctionalInterface    //Annotation of functional interface
interface Build {
	public void B();

}

public class SampleFunctional {
	public static void main(String[] args) {
		int width = 95234;

		// using lambda expression
		Build d2 = () -> {
			System.out.println();
			System.out.println("Building width is " + width);
		};

		d2.B();
	}
}