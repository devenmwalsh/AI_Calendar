package Calendar;

import java.util.HashMap;
import java.util.Map;
import java.time.DateTimeException;
import java.time.LocalDate;


public class CalendarApp {
	
	HashMap<String, CalendarItem> listOfEvents;
	
	public CalendarApp() {
		listOfEvents = new HashMap<>();
		
	}
	
	private void validateDateTime(int year, int month, int day, int firstTime, int secondTime) throws InvalidDateException, InvalidTimeException{
		try {
	        LocalDate.of(year, month, day); // Validate the date
	        if (firstTime >= 2400 || firstTime <= 0 || secondTime >= 2400 || secondTime <= 0) {
	        	throw new InvalidTimeException("Not a Valid Time: ");	
	        }
	    } catch (DateTimeException e) {
	        throw new InvalidDateException("Not a Valid Date: ");
	    }
	}
	
	public void createEvent(int year, int month, int day, int startTime, int endTime, String eventName) throws InvalidDateException {
		try {
            validateDateTime(year, month, day, startTime, endTime);
	        listOfEvents.put(eventName, new Event(year, month, day, startTime, endTime, eventName)); // Add the event
        } catch (InvalidDateException e) {
            System.out.println("Date Error: " + e.getMessage());
        } catch (InvalidTimeException e) {
            System.out.println("Time Error: " + e.getMessage());
        }
		
	}
	
	public void createTask(int year, int month, int day, int dueTime, String eventName) throws InvalidDateException {
		try {
            validateDateTime(year, month, day, dueTime, 0);
            listOfEvents.put(eventName, new Task(year, month, day, eventName, dueTime)); // Add the task
        } catch (InvalidDateException e) {
            System.out.println("Date Error: " + e.getMessage());
        } catch (InvalidTimeException e) {
            System.out.println("Time Error: " + e.getMessage());
        }
		
	}

	public void deleteCalendarItem(String eventName) {
		listOfEvents.remove(eventName);
	}
}
