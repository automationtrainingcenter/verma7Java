package abastraction;

public class Java8InterfaceImpl implements Java8Interfce {

	@Override
	public void methodOne() {
		System.out.println("method one interface");
	}

	@Override
	public void defaultMethod() {
		System.out.println("default method overriden in imlementation class");
	}

}
