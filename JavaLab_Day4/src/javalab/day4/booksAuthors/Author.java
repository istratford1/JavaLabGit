package javalab.day4.booksAuthors;
import java.util.*;

public class Author {

	/// methods : create book, write pages, publish book, list books
	/// Author may add pages to any book as long as it is not published !
	// properties: books (arraylist of type book), Author name, age, sex
	
	private List<Book> books = new ArrayList<Book>();
	private String authorName;
	private Integer age;
	private String sex;
	
	
	/// default constructor - an author must have these properties
	public Author(String _authorName, Integer _age, String _sex){
		authorName = _authorName;
		age = _age;
		sex = _sex;
		// initialise array of books
		//List<Book> books = new ArrayList<Book>();
					
	}
	
	// add new book to books
	public void createBook(String _bookTitle){
		
		Book bk = new Book(authorName,_bookTitle);
		if(bk != null){
			books.add(bk);
		}
	
	}
	
	
	public String allBooksStatus(){
		
		StringBuilder statusStr = new StringBuilder();
		statusStr.append("**** Author - " + authorName + " aged " + age + " ****");
		
		statusStr.append(System.getProperty("line.separator")); // newline
		for(Book b : books){
	    	statusStr.append(" Title: " + b.getTitle() + " (" +  b.getPageCount() +" pages) " + " " + b.getPublishStatus()); 
	    	statusStr.append(System.getProperty("line.separator")); // newline
	    }
		
		return statusStr.toString();
		
		
	}
	
	
	
	
    public void publishBook(String _bookTitle){
		
		Book bk = getBook(_bookTitle);
		if(bk.getPublishDate() != "" ){
			Date today = Calendar.getInstance().getTime(); 
			bk.setPublishDate(today.toString());
			
		} else {
			System.out.println("Cannot publish a book that has already been published");
			
		}
			
		
		
	}
	
	
	
	public void writePages(String _bookTitle, Integer _numPages){
		
		Book bk = getBook(_bookTitle);
		if(bk.getPublishDate() != "" ){
			bk.addPage(_numPages);
			
		} else {
			System.out.println("Cannot add pages to a published book");
			
		}
			
		
		
	}
	
	
	public Book getBook(String _bookTitle){
		
	    Book bk = new Book();
		for(Book b : books){
	    	if(b.getTitle() == _bookTitle){
	    		bk = b;
	            break;
	    	}else
	    		bk =  null;
     	}
	
		return bk;	
		
	}
}

	
	
	
	
	

