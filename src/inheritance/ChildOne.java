package inheritance;

public class ChildOne extends Parent{
	
	public ChildOne() {
		super();
		System.out.println("ChildOne class object created");
	}
	
	public void methodTwo() {
//		methodOne();
		System.out.println("childOne class method two");
	}
}
