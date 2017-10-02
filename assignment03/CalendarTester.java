package assignment03;

import java.time.LocalDateTime;

public class CalendarTester {
	public static void main(String[] args) {
		CalendarList list = new CalendarList();
		CalendarItem test = new CalendarItem();
		test.setDescription("this is just a sample meeting of CS 140");
		test.setEnd(LocalDateTime.of(2017,9,21,11,50));
		test.setStart(LocalDateTime.of(2017,9,21,10,50));
		test.setTitle("CS 140");
		test.setLocation("FA 212");
				
		CalendarItem test2 = new CalendarItem();
		test2.setDescription("this is just a sample meeting of Class A");
		test2.setEnd(LocalDateTime.of(2017,9,22,3,50));
		test2.setStart(LocalDateTime.of(2017,9,22,2,50));
		test2.setTitle("Class A");
		test2.setLocation("LH 001");
				
		CalendarItem test3 = new CalendarItem();
		test3.setDescription("this is just a sample meeting of Class B");
		test3.setEnd(LocalDateTime.of(2017,9,23,5,50));
		test3.setStart(LocalDateTime.of(2017,9,23,4,50));
		test3.setTitle("Class B");
		test3.setLocation("LH 001");
		
		//Exact copy of test3 to test conflict detection
		CalendarItem test4 = new CalendarItem();
		test4.setDescription("this is just a sample meeting of Class B");
		test4.setEnd(LocalDateTime.of(2017,9,23,5,50));
		test4.setStart(LocalDateTime.of(2017,9,23,4,50));
		test4.setTitle("Class B");
		test4.setLocation("LH 001");
		
		CalendarItem test5 = new CalendarItem();
		test5.setDescription("this is just a sample meeting of Class C");
		test5.setEnd(LocalDateTime.of(2017,9,24,10,50));
		test5.setStart(LocalDateTime.of(2017,9,24,8,50));
		test5.setTitle("Class C");
		test5.setLocation("LH 001");
		
		//Past item
		CalendarItem test6 = new CalendarItem();
		test6.setDescription("this is just a sample meeting of Class D");
		test6.setEnd(LocalDateTime.of(2016,9,24,10,45));
		test6.setStart(LocalDateTime.of(2016,9,24,8,45));
		test6.setTitle("Class D");
		test6.setLocation("LH 001");
		
		//Past item
		CalendarItem test7 = new CalendarItem();
		test7.setDescription("this is just a sample meeting of Class E");
		test7.setEnd(LocalDateTime.of(2016,8,24,10,45));
		test7.setStart(LocalDateTime.of(2016,8,24,8,45));
		test7.setTitle("Class E");
		test7.setLocation("LH 001");
		
		list.insertItem(test2);
		list.insertItem(test);
		list.insertItem(test3);
		
		System.out.println("----- Test printNext (without past items) -----");
		
		list.printNext();
		
		System.out.println("----- Test printCalendar -----");
		
		list.printCalendar();
		
		System.out.println("----- Test findConflict -----");
		
		System.out.println(list.findConflict(test4)); //Test conflict
		System.out.println(list.findConflict(test5)); //Test no conflict
		
		list.insertItem(test5);
		list.testingInsert(test6);
		list.testingInsert(test7);
		
		System.out.println("----- Test printNext (with past items) -----");
		
		list.printNext();
		
		System.out.println("\n----- Test printCalendar (without reset) -----");
		list.printCalendar();
		
		System.out.println("\n----- Test printCalendar (with reset) -----");
		list.resetFirst();
		list.printCalendar();
		}
}
