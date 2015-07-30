package javalab.day8.mediaLibrary.Library;

public class Book extends MediaItem {

	private String author;
	private String publisher;
	private int numPages;
	
	
	
	
	public Book(String name, String author, String publisher, int numPages) {
		super(name);
		this.author = author;
		this.publisher = publisher;
		this.numPages = numPages;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	@Override public String toString(){
		return  author + "|" + super.toString() + "|" + publisher + "|" + " Pages: " + numPages ; 
		
		
	}
	
}
