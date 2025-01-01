package Calendar;

import java.util.Scanner;


public class Controller {
	
	String keyPressed;
	CalendarApp calendar = new CalendarApp();
	Scanner scanner = new Scanner(System.in);
	
	public Controller() {
	}
	
	public void homeMenu() throws InvalidDateException {
        System.out.println("Press E to create a new event. Press T to create a new Task. Press D to delete an Event/Task. Press P to show the calendar");
		keyPressed = scanner.nextLine();
		
		switch (keyPressed) {
			case "e":
				createEvent();
				break;
			case "t":
				createTask();
				break;
			case "d":
				delete();
				break;
			case "p":
				showCalendar();
				break;
		}
	}
	
	
	private void createEvent() throws InvalidDateException {
		System.out.println("Please enter the year");
	    int year = Integer.parseInt(scanner.nextLine());
	    System.out.println("Please enter the month");
	    int month = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the day");
	    int day = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the start time");
	    int startTime = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the end time");
	    int endTime = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the event name");
	    String eventName = scanner.nextLine();
	    
	    calendar.createEvent(year, month, day, startTime, endTime, eventName);
	}
	
	private void createTask() throws InvalidDateException {
		System.out.println("Please enter the year");
	    int year = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the month");
	    int month = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the day");
	    int day = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the due time");
	    int dueTime = Integer.parseInt(scanner.nextLine());	    
	    System.out.println("Please enter the task name");
	    String taskName = scanner.nextLine();
	    
	    calendar.createTask(year, month, day, dueTime, taskName);
	}
	
	private void delete() {
		System.out.println("Please enter the event name");
		String eventName = scanner.nextLine();
		calendar.deleteCalendarItem(eventName);
		
	}
	
	private void showCalendar() {
		calendar.displayCalendar();	
	}
	
	

}
