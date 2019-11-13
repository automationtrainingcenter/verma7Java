package exceptions;

public class InvalidBrowserException extends RuntimeException{
	
	public InvalidBrowserException() {
		super("browser should be either chrome or firefox");
	}

}
