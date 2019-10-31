package bank;

public class Credit extends Account {
	private double cashLimit;

	public Credit(String accNum, String name, double balance, long phoneNum, long aadhar) {
		// here balance is credit limit
		super(accNum, name, balance, phoneNum, aadhar);
		this.cashLimit = this.balance * 0.3;
	}

	public Credit(String accNum, String name, double balance, long phoneNum, String panNum) {
		super(accNum, name, balance, phoneNum, panNum);
		this.cashLimit = this.balance * 0.3;
	}

	@Override
	public double withdraw(double amount) {
		if (amount > 0) {
			if (this.cashLimit >= amount) {
				this.cashLimit -= amount;
				this.balance -= amount;
				System.out.println("please collect your cash");
				this.balance -= 500;
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
