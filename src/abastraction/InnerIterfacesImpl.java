package abastraction;

import abastraction.Outer.Inner;

public class InnerIterfacesImpl implements Outer, Inner {

	@Override
	public void methodOne() {
		System.out.println("Outer interface method one");
	}

	@Override
	public void methodTwo() {
		System.out.println("Inner interface method two");
	}

	@Override
	public Inner method() {
		return this;
	}

}
