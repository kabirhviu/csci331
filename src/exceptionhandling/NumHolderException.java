package exceptionhandling;

public class NumHolderException extends Exception {
	
	public NumHolderException(String message) {
		super(message);
	}
	
	public NumHolderException(String message, Throwable cause) {
		super(message, cause);
	}

}
