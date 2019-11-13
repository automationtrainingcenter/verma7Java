package exceptions;

/*
 * Exception means interruption to the normal flow of execution.
 * Generally we have two types of exceptions
 * 1. checked exceptions also known compile time exception
 * 		These are the exceptions which will extends Exception class
 * 	 we can handle checked exception either by throwing that exception or by handling that exception using
 * try and catch blacks
 * 2. unchecked exceptions also known as runtime exception
 * 		These are the exceptions which will extends RuntimeException class
 * 	we can handle unchecked exception using try and catch block
 * 
 * try block contains the code which will rise an exception
 * 
 * catch block will catch that exception and handles that exception
 * 
 * finally block will execute the statement irrespective of exception
 * 
 * throws keyword will throw the exception to the corresponding method declaration
 *
 *
 * All the compile time exceptions are child classes of Exception class and all the
 * run time exceptions are child classes of RunTimeException class
 */

public class ExceptionHandlingDemo {
	
	public static void openBrowser(String browserName)   {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("chorme browser opened");
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.out.println("firefox browser opened");
		}else {
			throw new InvalidBrowserException();
		}
	}
	
	public static void main(String[] args)  {
		try {
			openBrowser("firefoxhg");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
