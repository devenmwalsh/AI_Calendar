package Calendar;

public class Task extends CalendarItem {
	
    private int dueTime;

	
	public Task(int year, int month, int day, String eventName, int dueTime) {
        super(year, month, day, eventName);
        this.dueTime = dueTime;

	}
	
    public int getEndTime() {
        return dueTime;
    }

}
