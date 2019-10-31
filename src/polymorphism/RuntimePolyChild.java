package polymorphism;

public class RuntimePolyChild extends RuntimePolyParent{
	
	public void  methodThree() {
		System.out.println("Child class method Three");
	}
	
	@Override
	public void methodTwo() {
		System.out.println("Child class overridden Parent class method two");
	}

}
