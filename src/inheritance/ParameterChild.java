package inheritance;

public class ParameterChild extends ParameterParent {

	public ParameterChild(int id, String name, double salary) {
		super(id, name, salary);
	}
	
	public String toString() {
		return super.toString();
	}

}
