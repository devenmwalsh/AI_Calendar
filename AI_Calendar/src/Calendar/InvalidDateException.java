package Calendar;

public class InvalidDateException extends Exception {
	
	public InvalidDateException(String message) {
		super("Invalid Date Exception: " + message);
	}

}
