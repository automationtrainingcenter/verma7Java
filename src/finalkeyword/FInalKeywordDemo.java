package finalkeyword;

/*
 * we can declare a variable or method or class as final
 * 
 * if we declare a variable as final then we can't change it's value, i.e. to create constants
 * we can use this final keyword
 * 
 * if we declare a method as final in a parent class then in child class we can't override that 
 * method
 * 
 * if we declare a class as final then no class will extends this class, i.e. final class can't have 
 * child classes 
 */
public class FInalKeywordDemo {
	
	int i = 20;
	
	final int j = 100;
	
	public static void main(String[] args) {
		FInalKeywordDemo obj = new FInalKeywordDemo();
		obj.i = 200;
//		obj.j = 1000;
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		FinalMethodParent fpObj = new FInalMethodChild();
		fpObj.methodOne();
		fpObj.methodTwo();
	}

}
