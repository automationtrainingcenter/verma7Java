package polymorphism;

public class CompileTimePoly {
	
	public void add(int a, String b) {
		int ib = Integer.parseInt(b);
		System.out.println(a+ib);
	}
	
	// by changing number of arguments
	public void add(int a, String b, int c) {
		int ib = Integer.parseInt(b);
		System.out.println(a+ib+c);
	}
	
	// by changing type of arguments
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	// by changing sequence of arguments
	public void add(String a, int b) {
		int ia = Integer.parseInt(a);
		System.out.println(ia+b);
	}
	
//	public int add(int a, String b) {
//		
//	} // simply by changing the return type we can't achieve compile time polymorphism
	
	

}
