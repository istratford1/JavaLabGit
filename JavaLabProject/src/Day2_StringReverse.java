import java.util.*;


public class Day2_StringReverse {

	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		String userWord = new String(myGetInput("Please enter a word",scn,2));
		scn.close();
		
		int wordLength = userWord.length();
		String revString = "";
	
		
		for(int i=wordLength -1; i > -1; i--){ // loop from end to start of word, remembering that 0 is the starting index for a string..
			
		   String rLetter = Character.toString(userWord.charAt(i));  // last letters decremented by i
		  	 
		   revString = revString +  rLetter;
		   
	
		}
		
		
	
		System.out.println("Reversed word: " + revString );
			
		
		
		
		
	}
	

	
	
	// MY GET INPUT
	// gets the user input from keyboard
	/// uses the java scanner object and console output to prompt the user for input
	/// INPUT: userMsg - text to display to user
	//  INPUT: s - scanner object
	//  INPUT: minLength - the minumum number of chars expected
	static String myGetInput(String userMsg, Scanner s, int minLength){
		
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
}
