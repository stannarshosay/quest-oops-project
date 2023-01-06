package exceptions;

@SuppressWarnings("serial")
public class AgeInvalidException extends RuntimeException {

	public AgeInvalidException() {
		super();
	}
	
	public AgeInvalidException(String message) {		
		super(message);		
	}

}
