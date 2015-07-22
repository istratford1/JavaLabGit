package javalab.day4.booksAuthors;

/// do stuff with books and author objects

public class Day4_BooksAuthors {

	public static void main(String[] args){
		
		
		Author tim = new Author("Tim", 45,"Male");
		Author john = new Author("Alex", 32, "Male");
		Author octavia = new Author("Octavia", 37, "Female");
		
		
		tim.createBook("Big Tim");
		tim.createBook("Little Tim");
		
		john.createBook("Big Long Book");
		john.createBook("Big Long Book vol 2");
			
		octavia.createBook("Octavia's Box");
		
		tim.writePages("Big Tim", 20);
		tim.writePages("Big Tim", 10);
		tim.writePages("Big Tim", 110);

		tim.writePages("Little Tim", 224);

		tim.getBook("Little Tim").getPageCount();
	
		tim.publishBook("Big Tim");
		tim.publishBook("Little Tim");
			
		octavia.writePages("Octavia's Box", 34);
		octavia.publishBook("Octavia's Box");
		
		
		System.out.println(tim.allBooksStatus());
		System.out.println(john.allBooksStatus());
		System.out.println(octavia.allBooksStatus());
		
		
		
		
		
		
	}
	
	
	
}
