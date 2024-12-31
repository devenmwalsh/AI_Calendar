package Calendar;

public class Event extends CalendarItem {

    private int startTime; // Represented in 24-hour format, e.g., 1400 for 2 PM
    private int endTime;

    public Event(int year, int month, int day, int startTime, int endTime, String eventName) {
        super(year, month, day, eventName);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Additional getter methods
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
