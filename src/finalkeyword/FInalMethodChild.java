package finalkeyword;

public class FInalMethodChild extends FinalMethodParent {

	@Override
	public void methodOne() {
		System.out.println("parent class methodone overridden in child class");
	}

	// we can't override parent class final methods in child class
//	@Override
//	public void methodTwo() {
//		System.out.println("parent class method two overridden in child class");
//	}

}
