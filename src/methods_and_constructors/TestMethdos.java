package methods_and_constructors;

public class TestMethdos {

	public static void main(String[] args) {
		// create an object of MethodsDemo class so that we can call the methods of that
		// class
		MethodsDemo obj = new MethodsDemo();

		obj.methodOne();

		obj.methodTwo(10);

		boolean r1 = obj.methodThree();
		System.out.println("the output of method three is " + r1);

		int r2 = obj.methodFour(10, 20);
		System.out.println("the output of method four is " + r2);
	}

}
