package assignment03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalendarItem {
	private LocalDateTime start;
	private LocalDateTime end;
	private String title;
	private String description;
	private String location;
	private CalendarItem nextItem;
	
	public LocalDateTime getStart() {
		return start;
	}
	
	public void setStart(LocalDateTime start) {
		if(end != null && end.isBefore(start))
			throw new IllegalArgumentException("the end cannot be before the start");
		this.start = start;
	}
	
	public LocalDateTime getEnd() {
		return end;
	}
	
	public void setEnd(LocalDateTime end) {
		if(start != null && start.isAfter(end))
			throw new IllegalArgumentException("the start cannot be after the end");
		this.end = end;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public CalendarItem getNextItem() {
		return nextItem;
	}
	
	public void setNextItem(CalendarItem nextItem) {
		this.nextItem = nextItem;
	}
	
	public boolean endsBefore(CalendarItem other) {
		return end.isBefore(other.start);
	}
	
	public boolean startsAfter(CalendarItem other) {
		return start.isAfter(other.end);
	}
	
	public boolean noTimeConflictWith(CalendarItem other) {
		return endsBefore(other) || startsAfter(other);
	}	
	public boolean hasTimeConflictWith(CalendarItem other) {
		return !noTimeConflictWith(other);
	}
	
	public String toString() {
		DateTimeFormatter dayForm =  DateTimeFormatter.ofPattern("MMMM d, yyyy");
		DateTimeFormatter timeForm =  DateTimeFormatter.ofPattern("h:m a");
		return start.format(dayForm) +" from " + start.format(timeForm) 
				+ " to " + end.format(timeForm) + "\n"
				+ title + " in " + location + "\n"
				+ description + "\n";
	}
	
	public static void main(String[] args) {
		CalendarItem test = new CalendarItem();
		test.setDescription("this is just a sample meeting of CS 140");
		test.setEnd(LocalDateTime.of(2017,9,11,11,50));
		test.setStart(LocalDateTime.of(2017,9,11,10,50));
		test.setTitle("CS 140");
		test.setLocation("FA 212");
		
		System.out.println(test);
		
		//End is before start
		CalendarItem test2 = new CalendarItem();
		test2.setDescription("this is just a sample meeting of CS 140");
		test2.setEnd(LocalDateTime.of(2017,9,11,9,50));
		test2.setStart(LocalDateTime.of(2017,9,11,10,50));
		test2.setTitle("CS 140");
		test2.setLocation("FA 212");
		
		System.out.println(test2);
		
		//Start is after end
		CalendarItem test3 = new CalendarItem();
		test3.setDescription("this is just a sample meeting of CS 140");
		test3.setEnd(LocalDateTime.of(2017,9,11,9,50));
		test3.setStart(LocalDateTime.of(2017,9,11,10,50));
		test3.setTitle("CS 140");
		test3.setLocation("FA 212");
		
		System.out.println(test3);
		}
}
