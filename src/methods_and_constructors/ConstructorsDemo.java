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
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

public class ConstructorsDemo {
	
	int i;
	String s;
	float f;
	boolean b;
	
	// default constructor
	public ConstructorsDemo() {
		i =100;
		s = "sunshine";
		f = 9.8f;
		b = true;
	}
	
	// parameterized constructor
	public ConstructorsDemo(int id, String name, float savings, boolean gender) {
		i = id;
		s = name;
		f = savings;
		b = gender;
	}
	
	
	public void display() {
		System.out.println("i = "+i+"\ts = "+s+"\tf = "+f+"\tb = "+b);
	}
	
	public static void main(String[] args) {
		ConstructorsDemo obj = new ConstructorsDemo();
		obj.display();

		ConstructorsDemo obj1 = new ConstructorsDemo(123, "siva", 12000.00f, true);
		obj1.display();
		
		ConstructorsDemo obj2 = new ConstructorsDemo(126, "sruthi", 9000.00f, false);
		obj2.display();
	}
	

}
