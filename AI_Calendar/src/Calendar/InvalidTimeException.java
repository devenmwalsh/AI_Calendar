package Calendar;

public class InvalidTimeException extends Exception {
	
	public InvalidTimeException(String message) {
		super("Invalid Time Exception: " + message);
	}

}
