package Calendar;

import java.util.HashMap;
import java.util.Map;

public class CalendarApp {
	
	HashMap<String, Event> listOfEvents;
	
	public CalendarApp() {
		listOfEvents = new HashMap<>();
		
	}
	
	public void createEvent(int year, int month, int day, int startTime, int endTime, String eventName) {
		Event newEvent = new Event(year, month, day, startTime, endTime, eventName);
		listOfEvents.put(eventName, newEvent);
		
	}
}
