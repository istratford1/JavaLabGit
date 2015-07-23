package javalab.day4.cyberpet;

import java.util.Scanner;

public class CyberpetGame {

	
	private static Cyberpet myPet;
	/**
	 * Cyberpet game class
	 * 
	 * gives the user a choice to eat, sleep of play 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args){
		
		 Scanner scn = new Scanner(System.in);	
		
		 myPet = new Cyberpet(myGetString("Please enter pet name", scn, 3));
		 
		 while (myPet.isAlive()){
			 
			 doAction(menuChoice(scn),myPet);
			 System.out.println(myPet.getStatusStr());
			 
			 			 
		 }
		  
		 
		 System.out.println(myPet.getPetName()+ " is dead #sorry");
			
		 
		 scn.close();
		
	}
	
	static void doAction(int actionNum, Cyberpet mPet){
				
		switch (actionNum) {
        case 1:
            // PLAY
            mPet.play();
            System.out.println("Playing");
        	break;
        case 2:
            //feed
        	mPet.feed();
            System.out.println("Feeding");
            break;
            
        case 3:
            // SLEEP
        	mPet.sleep();
            System.out.println("Sleeping");
            
        	break;
        
        
        default:
            // ERROR ?
        	
    }
}
		
		
		
		
		
		
	
	
	
	// MY GET STRING
	// gets the user input from keyboard
	/// uses the java scanner object and console output to prompt the user for input
	static String myGetString(String userMsg, Scanner s, int minLength){
		
	    /// set initial values
	    String returnStr = "";
	    int strLength = 0;
	    
	    while (strLength < minLength){
	    	System.out.println(userMsg + " minimum " + minLength + " letters");
	    	returnStr = (String) s.next(); // read scanner input into string
	    	strLength = returnStr.length(); // work out the length
	    	
	    	if (strLength >= minLength){
	    	  break; 
	    
	    	} else{
	    		System.out.println("Try again - must be at least " + minLength + " letters");
	    	
	    	}
	    
		  }
	    return returnStr;
		
	}
	

		
	
	
	 public static int menuChoice(Scanner scn) {

	        int selection;
	       
	        /***************************************************/

	        System.out.println("What next ?");
	        System.out.println("---------\n");
	        System.out.println("1 - Play");
	        System.out.println("2 - Feed");
	        System.out.println("3 - Sleep");
	       
	        selection = scn.nextInt();
	        return selection;    
	    }
}
