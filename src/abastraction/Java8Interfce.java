package abastraction;

public interface Java8Interfce {

	void methodOne();

	// static method
	static void staticMethod() {
		System.out.println("static method of interface");
	}

	// default method
	default void defaultMethod() {
		System.out.println("default method of interface");
	}

}
