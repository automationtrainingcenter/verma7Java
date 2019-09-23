package basic_concepts;
/*
 * class is a blueprint or template to create objects
 * class is a collection of objects
 * class is a logical entity which does not exist physically
 * 
 * 
 * object is an instance of class
 * object is a real time entity or run time entity which exist physically.
 * 
 * To create a class we have to use following syntax
 * access_modifier class ClassName{
 *		properties;
 *		.
 *		.
 *		.
 *		methods(){ ... }
 *		.
 *		.
 *	}
 * A class contains properties and methods. 
 * properties are combination of variables and datatypes to store data
 * methods are actions we can perform on objects
 * 
 * To create an object of a class we have to use following syntax
 * ClassName obj_name = new ClassName();
 * 
 * we can access the properties and methods of a class using object name
 * 
 */

// student class
public class ClassAndObjectDemo {
	// properties
	String name;
	String address;
	String course;
	int phNum;
	int id;
	
	
	// method
	public void display() {
		System.out.println("name = "+name);
		System.out.println("address = "+address);
		System.out.println("course = "+course);
		System.out.println("id = "+id);
		System.out.println("phone num ="+phNum);
	}
	
	public static void main(String[] args) {
		// create an object
		ClassAndObjectDemo obj1 = new ClassAndObjectDemo();
		obj1.name = "ravi";
		obj1.address = "lingampalli";
		obj1.course = "selenium";
		obj1.phNum = 90876546;
		obj1.id = 101;
		obj1.display();
		
		ClassAndObjectDemo obj2 = new ClassAndObjectDemo();
		obj2.name = "satish";
		obj2.address = "miyapur";
		obj2.course = "java";
		obj2.phNum = 87654321;
		obj2.id = 102;
		obj2.display();
		
		System.out.println("**************************************");
		obj1.course = "python";
		obj1.display();
		
		obj2.display();
	}
	
	
}
