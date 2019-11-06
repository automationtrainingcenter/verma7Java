package abastraction;

public class ClassImplTwoInterfaces implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodTwo() {
		System.out.println("methodTwo of IntefaceTwo");
	}

	@Override
	public void methodOne() {
		System.out.println("methodOne of IntefaceOne");

	}

	@Override
	public void commonMethod() {
		System.out.println("commonMethod in both InterfaceOne and IntefaceTwo");

	}

}
