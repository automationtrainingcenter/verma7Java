package inheritance;

public class ParameterParent {
	int id;
	String name;
	double salary;

	public ParameterParent(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id = "+this.id+"\tname = "+this.name+"\nsalary = "+this.salary;
	}

}
