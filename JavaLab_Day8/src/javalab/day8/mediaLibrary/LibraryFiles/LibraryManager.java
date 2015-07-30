package javalab.day8.mediaLibrary.LibraryFiles;



public class LibraryManager {


	// 	
	 // source of the library file
	protected static MediaLibrary lib;
	protected static ConsoleGUI consoleGUI;
	
	public LibraryManager() {
		// TODO Auto-generated constructor stub
	}
	

	
	
	/*me
	  the libabry manager is concerned with
	  	1. showing the gui, processing choices
 	
	    
	  
	*/
	
	public static void main(String[] args){
			
			
			// load the library with test data	
		   
			lib = new MediaLibraryTestData();  // extends MediaLibrary and adds test data
		    consoleGUI = new ConsoleGUI();
		    
		    // show the text menu
		    consoleGUI.showMenu();
			
			do{
			
			  doLibraryAction(consoleGUI.getMenuChoice());
			  consoleGUI.showMenu();
			  	
			
			} while (!consoleGUI.toQuit());	
		
		consoleGUI.showMsg("Quit Selected - goodbye !");
		
	}




      static void doLibraryAction(int menuChoice) {
	
		switch (menuChoice) {
		
		case 1 : consoleGUI.showList(lib.getLibraryList("Book"));
			break;
	
		case 2 : consoleGUI.showList(lib.getLibraryList("CD"));
			break;
		
		case 3 : consoleGUI.showList(lib.getLibraryList("DVD"));
			break;
		
		case 4 : consoleGUI.showList(lib.getLibraryList("BlueRay"));
			break;
	
		case 5 : consoleGUI.showList(lib.getLibraryList("DigitalFilm"));
			break;
		
		case 6	: lib.returnItem(consoleGUI.getItemRef());
			break;
		
		case 7	: lib.lendItem(consoleGUI.getItemRef(), consoleGUI.getMemberRef());
			break;
		case 8	:  // add member - not implemented
			break;
		
		case 9	: consoleGUI.setToQuit(true);
		
				
		
		
		}
		
		
		
	}
      



		
	
	
	
	

}
