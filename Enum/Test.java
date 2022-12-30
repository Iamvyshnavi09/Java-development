package Enum;

public class Test {

	public static void main(String[] args) {
		payment pt = payment.UPI;
		//System.out.println(pt);
		
		payment[] Types =payment.values(); // prints all values in the payment
		for(payment Type : Types) {
			System.out.println(Type);
			System.out.println(Type.ordinal()); // prints position of the values
			System.out.println(Type.getfee());  
		}
	}

}
