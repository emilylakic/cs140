package assignment03;

import java.time.LocalDateTime;
import java.util.Optional;

public class CalendarList {
	private CalendarItem first;
	private CalendarItem next;
	
	public void setNext() {
		CalendarItem temp = first;
		CalendarItem nowObject = new CalendarItem();
		nowObject.setStart(LocalDateTime.now());
		nowObject.setEnd(LocalDateTime.now());
		LocalDateTime now = LocalDateTime.now();
		
		while(temp != null && (temp.getEnd().isEqual(now) || temp.getEnd().isBefore(now))) {
			temp = temp.getNextItem();
		}
		next = temp;
	}
	
	public void resetFirst() {
		setNext();
		first = next;
	}
	
	public Optional<CalendarItem> findConflict(CalendarItem newItem) {
		CalendarItem temp = first;
		
		if(!temp.hasTimeConflictWith(newItem)) {
			while(temp.getNextItem() != null) {
				temp = temp.getNextItem();
				if(temp.hasTimeConflictWith(newItem)) {
					return Optional.of(temp);
				}
			}
		} else {
			return Optional.of(temp);
		}
		return Optional.empty();
	}
	
	private void insert(CalendarItem newItem) {
		if(first == null) {
			first = newItem;
		} else if(newItem.endsBefore(first)) {
			newItem.setNextItem(first);
			first = newItem;
		} else {
			CalendarItem temp = first;
			
			while(temp.getNextItem() != null && !newItem.endsBefore(temp.getNextItem())) {
				temp = temp.getNextItem();
			}
			newItem.setNextItem(temp.getNextItem());
			temp.setNextItem(newItem);
		}
	}
	
	public void insertItem(CalendarItem newItem) {
		if(first != null) {
			setNext();
			CalendarItem nowObject = new CalendarItem();
			nowObject.setStart(LocalDateTime.now());
			nowObject.setEnd(LocalDateTime.now());
			
			if(newItem.endsBefore(nowObject)) {
				throw new IllegalArgumentException("It is too late for that appointment");
			}
			
			if(nowObject.startsAfter(newItem)) {
				throw new IllegalArgumentException("That appointment is under way--run!");
			}
			
			Optional<CalendarItem> temp = findConflict(newItem);
			
			if(temp.isPresent()) {
				throw new IllegalArgumentException("You have a conflict. "
				+ "Please use findConflict to find the conflicting appointment");
			}
		}
		insert(newItem);
	}
	
	void testingInsert(CalendarItem item) {
		insert(item);
	}
	
	public void printNext() {
		System.out.println(next);
	}
	
	public void printCalendar() {
		CalendarItem temp = first;
		System.out.println(temp);
		while(temp.getNextItem() != null) {
			temp = temp.getNextItem();
			System.out.println(temp);
		}
	}
}
