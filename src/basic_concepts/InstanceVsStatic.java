package basic_concepts;
/*
 * Instance variables are object level. these variables will
 * have unique values for every object
 * and static variables are class level. these variables will have
 * common values across all the objects.
 */

public class InstanceVsStatic {
	// instance variables
	int iVar;
	
	// static variables
	static int sVar;
	
	public void display() {
		System.out.println("ivar = "+iVar+"\tsvar = "+sVar);
	}
	
	
	public static void main(String[] args) {
		InstanceVsStatic.sVar = 200;
		
		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.iVar = 10;
		obj1.display();
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.iVar = 20;
		obj2.display();
		
		System.out.println("CHANGING VALUES");
		obj2.sVar = 500;
		obj2.iVar = 50;
		
		obj1.display();
		obj2.display();
	}
	

}
