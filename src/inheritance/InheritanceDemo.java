package inheritance;

/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in OOP
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance. 
 * 
 * if a Parent class have a parameterized constructor only then child class must 
 * contain a parameterized constructor which will call the Parent class constructor
 */
public class InheritanceDemo {
	public static void main(String[] args) {
		// create an object of Parent class
		Parent pObj = new Parent();
		pObj.methodOne();
		

		// SINGLE INHERITANCE
		// create an object of ChildOne class
		ChildOne c1Obj = new ChildOne();
		c1Obj.methodTwo(); // ChildOne class
		c1Obj.methodOne(); // Parent class

		
		//Multilevel Inheritance
		// create an object of SubChild class
		SubChild scObj = new SubChild();
		scObj.methodThree(); //SubChild class
		scObj.methodTwo(); // ChildOne class
		scObj.methodOne(); // Parent class
		
		// hierarchical inheritance
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.methodFour(); // ChildTwo
		c2Obj.methodOne(); // Parent
		
		
		// Parameterized constructor in parent class
		ParameterChild pcObj = new ParameterChild(101, "surya", 50000);
		System.out.println(pcObj);
		
		// Object creation to the child class and object reference to the parent class
		Parent prObj = new ChildOne();
		prObj.methodOne();
		
		// to call child class methods we have to type cast parent class object reference to child class object reference
//		ChildOne crObj = (ChildOne) prObj;
//		crObj.methodTwo();
		
		((ChildOne)prObj).methodTwo();
		
	}

}
