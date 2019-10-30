package accessmodifiers;
/*
 * Java Provides 4 access modifiers
 * 1 Public: public properties, methods and classes can be accessed anywhere without any restriction
 * 2 Private: private properties and methods can be accessed within the class only. outside the class
 * we can't access private properties or methods
 * 3 Default: can be accessed with in that package only. if we are not specifying any access modifier then
 * that is a default access modifier
 * 4 Protected: same as default i.e. package level only. outside the package we can access protected
 * properties or methods using child class objects
 */

public class AccessModifiersDemo {
	
	public String pVar = "public";
	private String prVar = "private";
	String dVar = "default";
	protected String proVar = "protected";
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
		System.out.println(obj.prVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}
}
