package basic_concepts;
/* to read data from the console we have to use Scanner class
 * this class provides several methods to read different types of data
 * all these methods are instance methods so we have to create an Object of
 * Scanner class to call these methods
 * To create an object of Scanner class we have to pass InputStream class object 
 * to Scanner class constructor
 * this InputStream class object is available as a static property in System class
 * 
 * syntax
 * 	Scanner scObj = new Scanner(InputStream obj);
 * 	Scanner sc = new Scanner(System.in);
 * here System.in is an InputStream class object in System class
 */

import java.util.Scanner;

public class ReadingData {
	public static void main(String[] args) {
		
		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		// read an integer data
		System.out.println("enter some number");
		int i = sc.nextInt();
		System.out.println("number is "+i);
		
		
		// read float data
		System.out.println("enter some float data");
		float f = sc.nextFloat();
		System.out.println("float number is "+f);
		
		// read short data
		System.out.println("enter some short number");
		short sh = sc.nextShort();
		System.out.println("shrot number is "+sh);
		
		// read some double data
		System.out.println("enter some double number");
		double d = sc.nextDouble();
		System.out.println("double number is "+d);
		
		// read some boolean value
		System.out.println("enter some boolean data");
		boolean b = sc.nextBoolean();
		System.out.println("boolean data is "+b);
		
		
		// read some string data
		System.out.println("enter some string value");
		String str = sc.next();
		System.out.println("string data is "+str);
		
		/*
		 * to read a character data Scanner class does not have any 
		 * direct method. we have character as a string after that get the
		 * character from the string using String class charAt()
		 */
		System.out.println("enter some character");
//		String chstr = sc.next();
//		char ch = chstr.charAt(0);
		char ch = sc.next().charAt(0);
		System.out.println("character is "+ch);
	}
}
