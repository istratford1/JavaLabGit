package javalab.day9.mediaLibrary.MediaLibrary;


public class MediaLibraryTestData extends MediaLibrary {

	public MediaLibraryTestData() {
		// TODO Auto-generated constructor stub
		createDemoMediaLibrary();
	}
	
	
	
	
	private void createDemoMediaLibrary(){
		
	

		super.addNewItem(new CD("The Wall","Pink Floyd",9,8876655));
		super.addNewItem(new CD("Unknown Pleasures","Joy Division",8,2233767));
		super.addNewItem(new CD("Make mine a double","Double Trouble",12,7788666));
		super.addNewItem(new CD("Greatest Hits","Gary Glitter",19,66277738));
		
		super.addNewItem(new Book("The Other Half", "James McConnelly", "Penguin", 247));
		super.addNewItem(new Book("Peace", "Linda McCartney", "Always Press", 247));
		super.addNewItem(new Book("More Peace", "Linda McCartney", "Always Press", 211));
		super.addNewItem(new Book("Fingers and Thumbs", "Paul Beaston", "Red House", 247));
				
		super.addNewItem(new DVD("Star Wars",125,"George Lucus","Fantasy"));
		super.addNewItem(new DVD("The Matrix",110,"Andy Wachowski","Fantasy"));
		super.addNewItem(new DVD("Saving Private Ryan",135,"Stephen Spielberg","War"));
		
		super.addNewItem(new DigitalFilm("Saving Private Ryan",135,"Stephen Spielberg","War", "mp4", "/war/Spielberg"));
		super.addNewItem(new DigitalFilm("The Grand Bhudapest Hotel",142,"Wes Anserson","Comedy", "mp4", "/Comedy/Wes_Anderson"));
			
		super.addNewItem(new BlueRay("Star Wars",125,"George Lucus","Fantasy",false));
		super.addNewItem(new BlueRay("The Matrix",110,"Andy Wachowski","Fantasy",true));
		
			
		
		
		
		
		
		
	}
	

}
