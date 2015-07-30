package javalab.day8.mediaLibrary.Library;

public class MediaItem extends LibraryItem {

	private String name;	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	public MediaItem(String name) {
		super();
		this.name = name;
	}

	public MediaItem() {
		// TODO Auto-generated constructor stub
	}

	 @Override public String toString(){
		return name + "|" + super.toString();
				
		
	}
	
	
	
}
