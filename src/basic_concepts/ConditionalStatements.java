package basic_concepts;
/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// simple if example
		// verify a given number is positive
		int num = 125;
		if (num >= 0) {
			System.out.println("given number is positive");
		}

		// if else example
		// verify a given number is even or odd
		if (num % 2 == 0) {
			System.out.println("given number is even number");
		} else {
			System.out.println("given number is odd number");
		}

		// else if ladder to print biggest number in given two numbers
		int i = 100;
		int j = 10;
		if (i > j) {
			System.out.println("i is bigger");
		} else if (j > i) {
			System.out.println("j is bigger");
		} else {
			System.out.println("i and j both are equal");
		}

		// nested if to print biggest number in given two numbers
		if (i != j) {
			if (i > j) {
				System.out.println("i is bigger");
			} else {
				System.out.println("j is bigger");
			}
		} else {
			System.out.println("i and j both are equal");
		}

		// switch case
		String level = "";
		switch (level) {
		case "basic":
			System.out.println("displaying instructions");
			System.out.println("click here for hint");
			System.out.println("game launched in easy mode");
			break;
		case "moderate":
			System.out.println("click here for hint");
			System.out.println("game launched in moderate mode");
			break;
		case "advanced":
			System.out.println("game launched in advanced mode");
			break;
		default:
			System.out.println("invalid level entered");
		}

		//
		Scanner sc = new Scanner(System.in);
//		float expectedResult = 123.456f;
//		System.out.println("enter actual result");
//		float actualResult = sc.nextFloat();
//		if (expectedResult == actualResult) {
//			System.out.println("test case is passed");
//		} else {
//			System.out.println("test case is failed");
//		}
//
//		//
//		System.out.println("enter browser name");
//		String browserName = sc.next();
////		browserName = browserName.toLowerCase();
//		if (browserName.equalsIgnoreCase("chrome")) {
//			System.out.println("launching chrome browser");
//		} else if (browserName.equalsIgnoreCase("firefox")) {
//			System.out.println("launching firefox browser");
//		} else if (browserName.equalsIgnoreCase("opera")) {
//			System.out.println("launching opera browser");
//		} else {
//			System.out.println("launching IE browser");
//		}

		// facebook login scenario
//		System.out.println("enter username");
//		String username = sc.next();
//		System.out.println("enter password");
//		String password = sc.next();
//		if (username.equalsIgnoreCase("sunshine") && password.equals("Selenium")){
//			System.out.println("welcome user");
//		}else {
//			System.out.println("invalid credentials");
//		}

		System.out.println("enter gamil username");
		String guser = sc.next();
		if (guser.equalsIgnoreCase("sunshine")) {
			System.out.println("enter gmail password");
			String gpass = sc.next();
			if (gpass.equals("Selenium")) {
				System.out.println("welcome user");
			} else {
				System.out.println("invalid password");
			}

		} else {
			System.out.println("username does not exist");
		}

	}

}
