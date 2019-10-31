package bank;

public class Savings extends Account {
	private static double minBal = 10000;

	public Savings(String accNum, String name, double balance, long phoneNum, long aadhar) {
		super(accNum, name, balance + minBal, phoneNum, aadhar);
	}

	public Savings(String accNum, String name, double balance, long phoneNum, String panNum) {
		super(accNum, name, balance + minBal, phoneNum, panNum);
	}

	// overriding parent class withdraw method
	@Override
	public double withdraw(double amount) {
		if (amount > 0) {
			if (this.balance >= amount) {
				this.balance -= amount;
				System.out.println("please collect your cash");
				if (this.balance < minBal) {
					this.balance -= 50;
				}
				return amount;
			} else {
				System.out.println("insufficient balance");
				return 0;
			}
		} else {
			System.out.println("invalid amount, amount must be greater than 0");
			return 0;
		}

	}

}
