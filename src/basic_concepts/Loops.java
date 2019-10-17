package basic_concepts;

import java.util.Scanner;

/*
 * Loops are used to execute a block of statements repeatedly based on some
 * condition. Each and every repetition is known as an iteration.
 * 
 * Java contains mainly 4 loops
 * 1. while 
 * 2. do while
 * 3. for
 * 4. for each
 * here for each loop is used to iterate over a collection of data like 
 * arrays, It is not condition based loop
 * 
 * every loop (except for each) contains mainly 3 parts
 * 1. initialization
 * 2. condition or expression
 * 3. increment or decrement
 * 
 *while loop:
 *
 *initialize;
 *
 *while(condition or expression){
 *	statements which we want to repeat;
 *	increment or decrement
 *}
 *
 *the minimum number of iterations in while loop is 0
 *
 *do while loop:
 *
 *initialize;
 *
 *do{
 *	statements we want to repeat
 *	increment or decrement
 *}
 *while(condition or expression);
 *the minimum number of iterations in while loop is 1
 *
 *
 *for loop:
 *
 *for(initialization; condition or expression; increment or decrement){
 *	statements we want to repeat;
 *}
 *the minimum number of iterations in while loop is 0
 *
 *for each loop:
 *
 *for(collection_data_type var_name : collection_varaible_name){
 *	statements to repeat;
 *}
 *
 *the minimum number of iterations in while loop is 0
 */

public class Loops {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		// initialization
		int i = 1;

		// condition
		while (i <= 10) {
			System.out.println(i);
			// increment
			i++;
		}

		Scanner sc = new Scanner(System.in);
		String cmd = "";
		// read strings from the console until we enter exit
		do {
			System.out.println("enter command:\t");
			cmd = sc.next();
			System.out.println("cmd is " + cmd);
		} while (!cmd.equalsIgnoreCase("exit"));

		// print even numbers from 20 to 10
		for (int k = 20; k > 10; k -= 2) {
//			if (k % 2 == 0) {
			System.out.println(k);
//			}
		}

		// for each loop: retrieve the data from the array of integers
		int[] numbers = { 1, 3, 9, 12, 14, 8, 15, 7, 6, 2, 19, 17 };
//		for (int j = 0; j < numbers.length; j++) {
//			System.out.println(numbers[j]);
//		}
		for (int number : numbers) {
			System.out.println(number);
		}

		// break and continue statements
		// break statement will terminate loop based on some condition
		// continue statement will skip the current iteration and executes next
		// iteration
		int l = -1;
		while (l < 10) {
			l++;
			if (l == 5) {
//				break;
				continue;
			}
			System.out.println(l);
		}

		// verify given number is a prime number or not
		System.out.println("enter some number");
		int num = sc.nextInt();
		boolean status = true;
		for (int n = 2; n <= num / 2; n++) {
			if (num % n == 0) {
				System.out.println("number is divisible by " + n);
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println("given number is prime number");
		} else {
			System.out.println("given number is not prime");
		}

		// print prime numbers with in given range
//		for (int r = 10; r < 100; r++) {
//			boolean flag = true;
//			for (int n = 2; n <= r / 2; n++) {
//				if (r % n == 0) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag) {
//				System.out.print(r+"\t");
//			} 
//		}

		// read prime numbers from the console until we enter a non prime number
		boolean flag;
		do {
			System.out.println("enter a number");
			int number = sc.nextInt();
			flag = false;
			for(int n = 2; n <= number/2; n++) {
				if(number % n == 0) {
					flag = true;
					break; // for loop
				}
			}
			if(!flag) {
				System.out.println("number is "+number);
//				break; // do while loop
			}
		}while(!flag);

	}

}
