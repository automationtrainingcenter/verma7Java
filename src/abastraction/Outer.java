package abastraction;

public interface Outer {

	public void methodOne();
	
	Inner method();

	// inner interface
	interface Inner {

		void methodTwo();
	}

}
