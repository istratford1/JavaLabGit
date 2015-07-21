package javalab.day1;
import java.util.*;

// StarWarsNameGenerator
// First Java example (day 1)
// Generates a star wars name by combining elements of first name, last name, mothers maiden name and city
public class Day1_StarWarsNameGenerator {

	
	public static void main(String[] args){
		
		// 
		// instantiate scanner
		
		Scanner scn = new Scanner(System.in);
		
		/// initialise variables with input from user
		String firstName = new String(myGetString("Please enter first name",scn,3));
		String lastName = new String(myGetString("Please enter last name",scn,2));
		String maidenName = new String(myGetString("Please enter mothers maiden name",scn,2));
		String city= new String(myGetString("Please enter city name",scn,3));
		
		// close resources
		scn.close();
		
		//  work out the star wars first name
        String swFirstName = MyGetSubString(firstName,0,3) + MyGetSubString(lastName,0,2);
		
		// work out the star wars last name
        String swLastName = MyGetSubString(maidenName,0, 2) + MyGetSubString(city,0,3);
        
        // finally, show result to the user
        // check for error in string (should use an error handler, but hey..)
        
		System.out.println("Your Star Wars Name is: " + swFirstName + " " + swLastName);
        
				
	}
	
	
	
	
	// MY GET INPUT
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
	
	
	// MY GET SUBSTRING
	// returns a substring but first checks for string lengths that would be too short to return a valid value
		
	static String MyGetSubString(String inStr, int startPos, int endPos) {
		// test if the end position is less than the string length
		
		if (endPos <= inStr.length()  ){
			/// ok this will work, the end position will fit inside this string
		  	return inStr.substring(startPos, endPos);
		} else{
			// the end position supplied here is too big for the size of this string..
			return "ERROR";
			
		}
		
		
	}  // end mygetsubstring
	
	
}
