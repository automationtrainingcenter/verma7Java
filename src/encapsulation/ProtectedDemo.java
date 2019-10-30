package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);
//		System.out.println(obj.dVar);
//		System.out.println(obj.proVar);
		
		ProtectedDemo cobj = new ProtectedDemo();
		System.out.println(cobj.pVar);
//		System.out.println(cobj.prVar);
//		System.out.println(cobj.dVar);
		System.out.println(cobj.proVar); // protected properties can be accessed outside the package
		// using child class object
		
	}
}
