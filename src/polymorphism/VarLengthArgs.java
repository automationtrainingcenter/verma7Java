package polymorphism;

public class VarLengthArgs {
	/*
	 * to pass variable length of arguments to a method we have to use following
	 * Syntax in method declaration while creating arguments return_type
	 * methodName(data_type... arg_name){...}
	 */

	public static void method(int... args) {
		int sum = 0;
		for (int arg : args) {
			sum += arg;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		method();
		method(10, 20);
		method(10, 20, 30);
		method(10, 20, 30, 40);
	}
}
