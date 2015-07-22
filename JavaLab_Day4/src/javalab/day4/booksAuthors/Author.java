package javalab.day4.booksAuthors;
import java.util.*;

public class Author {

	/// methods : create book, write pages, publish book, list books
	/// Author may add pages to any book as long as it is not published !
	// properties: books (collection of type book), Author name, age, sex
	
	private ArrayList<Book> books;
	private String authorName;
	private Integer age;
	private String sex;
	
	
	/// default constructor - an author must have these properties
	public Author(String _authorName, Integer _age, String _sex){
		authorName = _authorName;
		age = _age;
		sex = _sex;
		// initialise array of books
		ArrayList<Book> books = new ArrayList<Book>();
					
	}
	
	// add new book to books
	public void createBook(String _bookTitle){
	
		books.add(new Book(authorName,_bookTitle));
	
	}
	
	
	public void writePages(String _bookTitle, Integer _numPages){
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
