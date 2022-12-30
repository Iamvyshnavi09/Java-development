package Enum;

public enum payment {
	UPI(5), DEBITCARD(10), CREADITCARD(5), CASH(20);

	int fee;

	payment(int fee) {
		this.fee = fee;
	}

	public int getfee() {
		return this.fee;
	}

}
