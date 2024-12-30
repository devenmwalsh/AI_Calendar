package Calendar;

public class Event {
	
	private int year;
    private int month;
    private int day;
    private int startTime; // Represented in 24-hour format, e.g., 1400 for 2 PM
    private int endTime;
    private String eventName;

    // Public constructor
    public Event(int year, int month, int day, int startTime, int endTime, String eventName) {
    	
        this.year = year;
        this.month = month;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventName = eventName; 
    }
    
 // Getter methods
    public int getYear() { 
    	return year; 
    }
    
    public int getMonth() { 
    	return month; 
    }
    
    public int getDay() { 
    	return day; 
    }
    
    public int getStartTime() { 
    	return startTime; 
    }
    
    public int getEndTime() { 
    	return endTime; 
    }
}
