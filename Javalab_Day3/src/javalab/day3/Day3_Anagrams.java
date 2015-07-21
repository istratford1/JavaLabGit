package javalab.day3;
import java.util.*;


public class Day3_Anagrams {

	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		
		String firstPhrase = new String(MyGetInput("Enter first phrase", scn, 3));
		String secondPhrase = new String(MyGetInput("Enter second phrase", scn, 3));
		scn.close();
		
		
		if(sortedString(firstPhrase).equals(sortedString(secondPhrase))) {
		  // we have a match !
		  System.out.println(firstPhrase + " is an anagram of " + secondPhrase);	
			
		} else {
			 System.out.println(firstPhrase + " is not an anagram of " + secondPhrase);	
					
			//
		}	
		
	}
		
	static String sortedString(String str){
	
	
		str = str.toUpperCase(); // upper case to allow for differences in capitalisation
		str = str.trim(); // trim start and end
		str = str.replace(" ", ""); // get rid of spaces
		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
		
		
	
	
	// MY GET INPUT
	// gets the user input from keyboard
	/// uses the java scanner object and console output to prompt the user for input
	/// INPUT: userMsg - text to display to user
	//  INPUT: s - scanner object
	//  INPUT: minLength - the minimum number of chars expected
	static String MyGetInput(String userMsg, Scanner s, int minLength){
		
	    /// set initial values
	    String returnStr = "";
	    int strLength = 0;
	    
	    while (strLength < minLength){
	    	System.out.println(userMsg + " minimum " + minLength + " letters");
	    	returnStr = (String) s.nextLine(); // read scanner line into string
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
		
		

	



