package javalab.day7.guessingGame;

import java.util.Scanner;

public class ConsoleGUI {

	
	protected Scanner scn;
	
	public ConsoleGUI() {
		// initialise the scanner
		resetScanner();
		
	}

	private void resetScanner(){
		scn = new Scanner(System.in);
		
	}
	
	
	
	
	public void ShowMsg(String msg){
		
        System.out.println(msg);

	
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
