package javalab.day3;
import java.util.Scanner;


public class Day3_StringPallindrome {

	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		String userWord = new String(MyGetInput("Please enter a word",scn,2));
		scn.close();
		
		int wordLength = userWord.length();
		String revString = "";
		int palinCount = 0;
		int f = 0; // forward count
		
		for(int i=wordLength -1; i > -1; i--){ // loop from end to start of word, remembering that 0 is the starting index for a string..
			
		   String rLetter = Character.toString(userWord.charAt(i));  // last letters decremented by i
		   String fLetter = Character.toString(userWord.charAt(f));  // first letters incremented by f
			 
		   revString = revString +  rLetter;
		   
		   if(rLetter.equals(fLetter)) palinCount ++; // if the forward letter matches the backward letter, it might be a palindrome..
		   
		   f++; /// move the f counter forward in the word
		}
		
		
		if(palinCount == wordLength){ // pallindrome must have all matching characters
			System.out.println("It's a pallindrone: " + revString );
		 
		} else {
			System.out.println("Not a pallindrome " + userWord );
			
		}
		
		
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
