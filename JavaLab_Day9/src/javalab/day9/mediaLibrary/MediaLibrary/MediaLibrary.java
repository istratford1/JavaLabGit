package javalab.day9.mediaLibrary.MediaLibrary;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//  class to provide in and out access to the LibraryItems
//

public class MediaLibrary {

	private ArrayList<LibraryItem> libArr ;
	
	private String libraryPath;
	

	
	public MediaLibrary(String libraryPath) {
		// TODO Auto-generated constructor stub
		this();
		this.libraryPath = libraryPath;
		readFromFile();
	
	}


	public MediaLibrary() {
		// TODO Auto-generated constructor stub
		libArr = new ArrayList<LibraryItem>();
	}


	public void lendItem(String itemRef, String memberRef){
		// sets an item in the library as lent an item to a member
		// sets dueback date, sets lastLent date, sets lent boolean
		
		LibraryItem itemToLend = getLibItem(itemRef);  
		if (itemToLend != null){
			itemToLend.setDueBackDate(getDueDateCal());
			itemToLend.setLastLentDate(getTodayDateCal());
			itemToLend.setMemberRef(memberRef);
			
		} else {
			// error, item not found in library !
			
			
		}
		
		  
		  
	}
	
	
	public void addNewItem(LibraryItem item){
		
		// generate new catalog number
		item.setCatalogRef(generateCatalogRef());
		item.setAddedDate(getTodayDateCal());
	    // get the media type by looking at class
		String fullClassName = item.getClass().getName();
		String subClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
		item.setMediaType(subClassName);
		libArr.add(item);
		
		
	}
	
	

	private LibraryItem getLibItem(String catRef){
		
		LibraryItem li = null ;
		
		for(LibraryItem m :libArr){
			
		    if(m.getCatalogRef().equals(catRef)){
		    	li = m;
		    	break;
		    	
		    }
						
		}
		
		return li;
		
	}
	
	
	
	String generateCatalogRef(){
		
		LibraryItem li = null;
		String catRef = "";
		do{
			int rndNum = randomValue(1,10000);
			catRef = "CAT" + String.format( "%05d",rndNum);
			li = getLibItem(catRef); // if no item exists with this cat ref will return null....
		} while(li != null); // /continue to loop until we find an item without the generated catref
		
		return catRef;
		
	}
	
	
	
	
	
	 int randomValue(int minValue, int maxValue)
	{
	   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
	   
	   return (int)(Math.random() * range) + minValue;
	}

	
	
	
	private Calendar getDueDateCal(){
		Calendar cal = Calendar.getInstance(); // gets a calendar object initialised to the current date
		cal.add(Calendar.DATE, 21);
		return cal;	
	}
	
	private Calendar getTodayDateCal(){
		Calendar cal = Calendar.getInstance(); // gets a calendar object initialised to the current date
		return cal;	
	}
	
	public void returnItem(String itemRef){
		// sets as item in the library as returned
		// null dueback date, lent = false, member = ""
		this.getLibItem(itemRef).resetLentStatus();
			
		
	}
	
	

	public ArrayList<String> getCatalogRefList(){
		// gets an arraylist of items in a specific category
		ArrayList<String> arr = new ArrayList<String>();
		
		for(LibraryItem li : libArr){
				
			arr.add(li.getCatalogRef()); 
			 				
		}
		
		// get the items
		
		return arr;
	
		
	}	
	
	public ArrayList<String> getLibraryList(String mediaType){
		// gets an arraylist of items in a specific category
		ArrayList<String> arr = new ArrayList<String>();
		
		for(LibraryItem li : libArr){
			if(mediaType !=""){
			  if(li.getMediaType().equals(mediaType)){
				
				  arr.add(li.toString()); 
			  }	  
			  
				
			} else{
				// no media type selected, show all !
				arr.add(li.toString());
			}
			
			
		}
		
		// get the items
		
		return arr;
	
		
	}
	
	
	public void readFromFile(){
		// read all library ltems from textFile
		
		
	}
	
	

	public void writeToFile(){
		// write all library ltems to textFile
		
		
	}


	
	
	
	
	
	
}
