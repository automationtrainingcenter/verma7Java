package bank;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your account type");
		String accType = sc.next().toLowerCase();
		Account acc = null;
		switch (accType) {
		case "savings":
			acc = new Savings("12398700661", "surya", 20000, 9876543001l, "avapp8765f");
			break;
		case "current":
			acc = new Current("12398700661", "surya", 20000, 9876543001l, "avapp8765f");
			break;
		case "credit":
			acc = new Credit("12398700661", "surya", 20000, 9876543001l, "avapp8765f");
			break;
		default:
			break;
		}
		acc.deposite(10000);
		acc.displayBalance();
		double amount = acc.withdraw(15000);
		System.out.println(amount);
		acc.displayBalance();
		acc.withdraw(20000);
		acc.displayBalance();
	}

}
