package basic_concepts;
/*
 * String is a collection of characters
 * Strings are immutable in java that means we can't modify or change string data once 
 * stored in a memory location
 * Strings will store in separate memory location known as String constant pool
 * To create mutable strings we have to use StringBuilder or StringBuffer classes
 * 
 * String values must be stored using ""
 */

public class StringsDemo {
	public static void main(String[] args) {
		String s1 = "Selenium";
		String s2 = "Java";
		String s3 = "Selenium";
		String s4 = "Java";
		s4 = "sunshine";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		String s5 = "Java";
		System.out.println(s5.hashCode());
	}
}
