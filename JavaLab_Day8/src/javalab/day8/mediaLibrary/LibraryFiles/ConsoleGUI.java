package javalab.day8.mediaLibrary.LibraryFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleGUI {
	
	
    private Scanner scn;
	private boolean quit;
	
	public ConsoleGUI() {
		// initialise the scanner
		resetScanner();
	
		
	}

	private void resetScanner(){
		scn = new Scanner(System.in);
		
	}
	
	
	
	
	public void showMsg(String msg){
		
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
	
	public String getItemRef(){
		showMsg("PLease enter catalog Ref");
		return getUserString();
		
		
		
	}
	
	public String getMemberRef(){
		showMsg("PLease enter member ID");
		return getUserString();
		
		
	}





	
	public void showList(ArrayList<String> myStringList) {
		// TODO Auto-generated method stub
		
		for(String s: myStringList){
			System.out.println(s);
			
		}
		
		
	}

  


	int getMenuChoice() {
		
		return getUserInt();
		
	}




	 void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("******* MAIN MENU *********");
		System.out.println("\n");
		//   items
		System.out.println("1. Browse Books");
		System.out.println("2. Browse CDs");
		System.out.println("3. Browse DVDs");
		System.out.println("4. Browse BlueRays");
		System.out.println("5. Browse Digital Films");
		// admin		
		System.out.println("6. Return Item");
		System.out.println("7. Lend Item");
		System.out.println("8. Add member");
		System.out.println("9. Quit");
		System.out.println("\n");
		System.out.println("**************************");		
			
		
		 
		
	}

	public boolean toQuit() {
		return quit;
	}

	public void setToQuit(boolean quit) {
		this.quit = quit;
	}
}
