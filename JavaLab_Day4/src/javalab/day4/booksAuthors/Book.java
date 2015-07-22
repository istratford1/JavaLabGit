package javalab.day4.booksAuthors;

public class Book {

	// properties: pagecount, bookname, authorName , ISBN no, Publish Date
	// basic container class as a book cannot do much...
	
	private Integer pageCount;
	private String title;
	private String publishDate;
	private Integer ISBNnumber;
	private String authorName;

	// default constructor
	public Book(){
	
		pageCount = 0;
				
	}
	
	
	// overload constructor - book must have an author
	public Book(String _AuthorName){
		this();
		authorName = _AuthorName;
				
	}
	
	// overload constructor
	// may have a title !
	public Book(String _AuthorName, String _title){
		this(_AuthorName);
		title = _title;
				
	}

	/// adds n pages to the book
	public void addPage(int n){
		pageCount =+ n;
				
	}
	
	

	/// checks if the book has been published
	public String getPublishStatus(){
		if(publishDate != null){
			return "published on "+ publishDate;
			
		} else {
			
			return "not published" ;
			
		}
		
		
	}
	
	
	/// default getters and setters...
	
	
	
	public Integer getPageCount() {
		
		return pageCount;
	}


	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}


	public Integer getISBNnumber() {
		return ISBNnumber;
	}


	public void setISBNnumber(Integer iSBNnumber) {
		ISBNnumber = iSBNnumber;
	}


	public String getAuthorName() {
		return authorName;
	}



	
	
	
	
	
	
}
