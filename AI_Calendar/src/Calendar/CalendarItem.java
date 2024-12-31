package Calendar;

public class CalendarItem {

    private int year;
    private int month;
    private int day;
    private String eventName;

    // Public constructor
    public CalendarItem(int year, int month, int day, String eventName) {
        this.year = year;
        this.month = month;
        this.day = day;
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

    public String getEventName() {
        return eventName;
    }
}
