package basic_concepts;

public class TestVariablesDemo {
	public static void main(String[] args) {
		//accessing static variable of VariablesDemo class
		System.out.println("static variables s = "+VariablesDemo.s);
		
		// accessing instance variable of VariablesDemo class
		VariablesDemo obj = new VariablesDemo();
		System.out.println("instance variable i ="+obj.i);
	}

}
