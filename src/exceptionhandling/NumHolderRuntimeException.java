package exceptionhandling;

public class NumHolderRuntimeException extends RuntimeException {
	
	public NumHolderRuntimeException(String message) {
		super(message);
	}
	
	public NumHolderRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}
