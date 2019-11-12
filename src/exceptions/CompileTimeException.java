package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) {
		System.out.println("first statement");
		try {
			System.out.println(10 / 0); // run time exception
		} catch (Exception e) {
			System.out.println("got an " + e.getClass().getName());
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("third statement");

		// compile time exception
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("fourth statement");

		// file operations
		try {
			FileInputStream fis = new FileInputStream(".\\resources\\input.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file not available at a given location");
		} finally {
			System.out.println("exceutes always");
		}

	}

}
