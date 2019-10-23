package methods_and_constructors;
/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * this keyword we can use with in constructors and instance methods of the class 
 * to access instance variables. we can't use this keyword in static methods.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

import java.util.List;
import java.util.Scanner;

public class ConstructorsDemo {

	int id;
	String name;
	float savings;
	boolean gender;
	long aadhar;
	String pan;

	// default constructor
	public ConstructorsDemo() {
		this.id = 100;
		this.name = "sunshine";
		this.savings = 9.8f;
		this.gender = true;
		this.aadhar = 0000000000000000l;
		this.pan = "xxxxx0000x";
	}

	private ConstructorsDemo(int id, String name, float savings, boolean gender) {
		this.id = id;
		this.name = name;
		this.savings = savings;
		this.gender = gender;
	}

	// parameterized constructor
	public ConstructorsDemo(int id, String name, float savings, boolean gender, long aadhar) {
		this(id, name, savings, gender);
		this.aadhar = aadhar;
	}

	// parameterized constructor
	public ConstructorsDemo(int id, String name, float savings, boolean gender, String pan) {
		this(id, name, savings, gender);
		this.pan = pan;
	}

	public void display() {
		System.out.println("id = " + this.id + "\tname = " + this.name + "\tsavings = " + this.savings + "\tpan = "
				+ this.pan + "\taadhar = " + this.aadhar);
	}

	public static void main(String[] args) {
		ConstructorsDemo obj = new ConstructorsDemo();
		obj.display();

		ConstructorsDemo obj1 = new ConstructorsDemo(123, "siva", 12000.00f, true, "avapp1234g");
		obj1.display();

		ConstructorsDemo obj2 = new ConstructorsDemo(126, "sruthi", 9000.00f, false, 9876123400112389l);
		obj2.display();
	}

}
