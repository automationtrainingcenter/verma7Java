package encapsulation;
/*
 * encapsulation means hiding data (properties) from the outside world.
 * Encapsulation means binding data and operations on the data together
 * 
 * Note: If we declare any property or method as private with in a class
 * then that property or method can be accessed with in that class only, 
 * we can't access them outside of the class
 * 
 * 
 */

import java.util.Scanner;

public class EncapsulationDemo {
	private int id;
	private String name;
	private String course;
	private int pin;

	public EncapsulationDemo(int id, String name, String course, int pin) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.pin = pin;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pin");
		int pin = sc.nextInt();
		if (this.pin == pin) {
			this.course = course;
		}else {
			System.out.println("invalid pin");
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
