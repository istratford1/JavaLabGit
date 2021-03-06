package javalab.day3;

import java.util.*;

public class Day3_CaesarCypher {
	
	public static void main(String[] args){
	/// get input	///
		
		Scanner scn = new Scanner(System.in);
		// use input for sentance and cyper key
		
		// int keyNum = myGetInt("Enter Number",scn);
		// String sentance = myGetString("Enter sentance to be encoded",scn,6);
		
		/// for testing supply the string and the key as initialised variables
		int keyNum = 8;
		String sentance = "abcd pqrs ABCD PQRS";
		
		if ( false == isValidString(sentance)){
			System.out.println("Please only use Characters a-z,A-Z and space " );		
			
		} else{
			
			String encodedSentance = encode(sentance,keyNum);
			
			System.out.println("Original sentance:" + sentance);		
			System.out.println("Encoded sentance: " + encodedSentance);		
			System.out.println("Decoded sentance: " + decode(encodedSentance,keyNum));		
			
			
		}
					
		
	}

	
	/// encode the string according to the cipher key
	// INPUT: str - the string to be encoded
	// 		  key - the cipher to be used 
	static String encode(String str, int key){
		
		String eStr = "";
		String badChars = "";
		int chaNum = 0;
		/// for loop around the string
		for(int i=0; i<str.length(); i++){
			chaNum =  (int) str.charAt(i); // get the existing char number
			char newChar = (char) (int) encodeCharNum(chaNum, key);
			eStr = eStr + Character.toString(newChar);
						
		}
		
	
		if (badChars.length() ==0) {
    	   return eStr;
		}else{
		   return "";
		}
			
	}
	
	
	
	
	/// decode the string according to the cipher key
	// INPUT: str - the string to be encoded
	// 		  key - the cipher to be used 
	static String decode(String str, int key){
		
		String eStr = "";
		String badChars = "";
		int chaNum = 0;
		/// for loop around the string
		for(int i=0; i<str.length(); i++){
			chaNum =  (int) str.charAt(i); // get the existing char number
			char newChar = (char) (int) decodeCharNum(chaNum, key);
			eStr = eStr + Character.toString(newChar);
						
		}
		
	
		if (badChars.length() ==0) {
    	   return eStr;
		}else{
		   return "";
		}
				
		
	}
	
	
	
	// isValidString
	// checks each character in the string to ensure that it is in the expected range
	static boolean isValidString(String str){
		boolean badFound = false;
		for(int i=0; i < str.length(); i++){
			int charNum = (int) str.charAt(i);
			if (! isValidCharNum(charNum)){
				badFound = true;
				break;
				
			}
		}
		
	 return !badFound;	
	}
	
	
	
	
	// isValidChar
	// returns true if the character is in the valid range
	static boolean isValidCharNum(int chaNum){
		
		if (isBetween(chaNum,65,90)){
			/// lowercase
			return true;
		} else if (isBetween(chaNum,97,122)){
			// uppercase
			return true;
		} else if (chaNum == 32){
			// space
			return true;
		} else {
			return false;
		}
		
	}
	
	// encodeCharNum
	// returns encoded character number according  to key provided
	static Integer encodeCharNum(int chaNum, int keyNum ){
		
		
		if (isBetween(chaNum,65,90)){
			/// Upper case
			int underOffset = 65 - (chaNum - keyNum) ;
			if(underOffset > 0){
				// would be below character set , so needs to be offset to new char
				return (90-underOffset);
			}else{
				return (chaNum - keyNum);
			}
			
		
		} else if (isBetween(chaNum,97,122)){
			// lowercase
			int underOffset = 97 - (chaNum - keyNum) ;
			if(underOffset > 0){
				// would be below character set , so needs to be offset to new char
				return (122-underOffset);
			}else{
				return (chaNum - keyNum);
			}
			
			
		} else if (chaNum == 32){
			// space
			return keyNum;
			
		} else {
			return 0;
			
		}
		
	}
	
	// decodeCharNum
		// returns decoded character number according  to key provided
		static Integer decodeCharNum(int chaNum, int keyNum ){
			
			int overOffset;
			
			/// upperCase
			if (isBetween(chaNum,65,90)){
				overOffset = 90 - (chaNum + keyNum) ; // work out the offset
				if(overOffset <= 0){
					// would be above character set , so needs to be offset to char lower in the charset
					return (65 + -(overOffset));
				}else{
					return (chaNum + keyNum);
				}
				
								
			} else if (isBetween(chaNum,97,122)){
				// lowerCase
				overOffset = 122  - (chaNum + keyNum)  ; // test for values that would fall below characterset
				if(overOffset <= 0){
					// would be above character set , so needs to be offset by the number of characters over
					return (97 + -(overOffset));
				}else{
					return (chaNum + keyNum);
				}
				
				
			} else if (chaNum == 32){
				// space
				return keyNum;
				
			} else {
				return 0;
				
			}
			
		}
	
		
		
	/// isBetween
	// works out if an integer falls between two set values
	public static boolean isBetween(int x, int lower, int upper) {
		  return lower <= x && x <= upper;
		}
	

	
	// MY GET INT
	// gets the user input from keyboard
	/// uses the java scanner object and console output to prompt the user for input
	static Integer myGetInt(String userMsg, Scanner s){
		
	    /// set initial values
	    int num =  0;
	    
	    while (s.hasNextInt()) {
	    	System.out.println("Enter whole number between 1 and 10");
	    	num =  s.nextInt(); // read scanner input into string
	    
		  }
	    return num;
		
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
}
