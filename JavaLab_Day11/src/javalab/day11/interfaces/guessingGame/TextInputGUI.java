package javalab.day11.interfaces.guessingGame;

import java.util.Scanner;

public class TextInputGUI {

	
	protected Scanner scn;
	
	public TextInputGUI() {
		// initialise the scanner
		resetScanner();
		
	}

	private void resetScanner(){
		scn = new Scanner(System.in);
		
	}
	
	
	

	
	
    public int getUserInt(){
		int selection;
	    resetScanner();
		selection = scn.nextInt();
        return selection;  
				
	}
	
	

	public String getUserString(){
		String selection;
		resetScanner();
		selection = scn.nextLine();
        return selection;  
			
		
	}
	
	
	// Mygetyesno
	// gets the user input from keyboard, must be y or n
	/// uses the java scanner object 
	public boolean getYesNo(){
		
	    /// set initial values
		resetScanner();
		
		String returnStr = "";
	    boolean response = false;
	    		
	    do {
	    	returnStr =  scn.next(); // read scanner input into string
	    	
	    	if (returnStr.equalsIgnoreCase("y")){
	    		response = true;
	    		break;
	    			    		
	    	} else {
	    		response = false;
	    		break;
		   	}
	    	
	    	
		  } while ( !returnStr.equalsIgnoreCase("y") || !returnStr.equalsIgnoreCase("n"));
	    return response;
		
	} 
	
	
}
