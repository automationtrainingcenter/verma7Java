package bank;

public class Account implements IAccount {

	// private properties
	private String accNum;
	private String name;
	protected double balance;
	private long phoneNum;
	private long aadhar;
	private String panNum;

	// private constructor
	private Account(String accNum, String name, double balance, long phoneNum) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
		this.phoneNum = phoneNum;
	}

	// overloaded constructor
	public Account(String accNum, String name, double balance, long phoneNum, long aadhar) {
		this(accNum, name, balance, phoneNum); // constructor chaining
		this.aadhar = aadhar;
	}

	// overloaded constructor
	public Account(String accNum, String name, double balance, long phoneNum, String panNum) {
		this(accNum, name, balance, phoneNum); // constructor chaining
		this.panNum = panNum;
	}

	// getter and setter for properties
	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAccNum() {
		return accNum;
	}

	public String getName() {
		return name;
	}

	public long getAadhar() {
		return aadhar;
	}

	public String getPanNum() {
		return panNum;
	}

	// display balance functionality
	public void displayBalance() {
		System.out.println("available balance in your account is " + this.balance);
	}

	public void deposite(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("amount deposite successful");
		} else {
			System.out.println("invalid amount, amount must be greater than 0");
		}
	}

	public double withdraw(double amount) {
		if (amount > 0) {
			if (this.balance >= amount) {
				this.balance -= amount;
				System.out.println("please collect your cash");
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
