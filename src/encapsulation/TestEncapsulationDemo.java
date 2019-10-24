package encapsulation;

public class TestEncapsulationDemo {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo(101, "surya", "java", 1234);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getCourse());
		obj.setCourse("python");
//		obj.name = "sravan";
		System.out.println(obj.getCourse());
	}
}
