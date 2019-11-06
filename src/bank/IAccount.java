package bank;

public interface IAccount {

	long getPhoneNum();

	void setPhoneNum(long phoneNum);

	String getAccNum();

	String getName();

	long getAadhar();

	String getPanNum();

	void displayBalance();

	void deposite(double amount);

	double withdraw(double amount);
}
