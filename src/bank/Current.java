package bank;

public class Current extends Account {
	private static double minBal = 25000;

	public Current(String accNum, String name, double balance, long phoneNum, long aadhar) {
		super(accNum, name, balance + minBal, phoneNum, aadhar);
	}

	public Current(String accNum, String name, double balance, long phoneNum, String panNum) {
		super(accNum, name, balance + minBal, phoneNum, panNum);
	}

	@Override
	public double withdraw(double amount) {
		if (amount > 0) {
			if (this.balance >= amount) {
				this.balance -= amount;
				System.out.println("please collect your cash");
				if (this.balance < minBal) {
					this.balance -= 200;
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
