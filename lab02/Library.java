package lab02;

public class Library {
	
	public static void main(String[] args) {
		
		Book[] library = new Book[3];
		library[0] = new Book("Swift", 600);
		library[1] = new Book("Java", 820);
		library[2] = new Book("Objective C", 50);
		
		for(int i = 0; i <library.length; i++) { //goes through each element in the array library 
			System.out.println(library[i].getTitle()); //prints out the title for each element in the array library
		}
		
		for(Book b : library) { 
			System.out.println(b.getnumPages());
		}
		
		System.out.println("\nExpected # of Pages: 1470");
		System.out.println("numPagesInLibrary: " + numPagesInLibrary(library));

		System.out.println("\nExpected Longest # of Pages: 820");
		System.out.println("mostPages: " + mostPages(library));
	}
	
	public static int numPagesInLibrary(Book[] books) { 
		
		int totalPages = 0;
		for (Book b : books) { 
			totalPages = totalPages + b.getnumPages();
		}
		return totalPages;
	}
	
	public static int mostPages(Book[] books) { 
		
		int longestBook = 0;
		for (Book b : books) { 
			if(longestBook < b.getnumPages()) { 
				longestBook = b.getnumPages();
			}
		}
		return longestBook;
	}	
}
