package javalab.day4.threeDoors;
import java.util.*;


public class Game {

	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		int playerBox;
		Player myPlayer = getPlayer(scn); // returns computer or real player
			
		Boxes myBoxes = new Boxes(); // init will choose a random box with prize
		
		if (! myPlayer.isComputer()){  // human !
		  playerBox = boxChoice(scn, "Choose any box"); 
		
		}else{  // computer
		  playerBox = randomValue(1,3);
		}
		
		System.out.println("Box " + playerBox + " has been chosen");
		
		
		// now reveal random goat
		int randomGoatBox = myBoxes.randomGoat();
		while (randomGoatBox == playerBox){
		   randomGoatBox = myBoxes.randomGoat();

		}
		
		System.out.println("Box " + randomGoatBox + " contains a goat...");
		
		
		// to switch ?
		int switchBox = myBoxes.switchBoxes(randomGoatBox, playerBox);
		if (! myPlayer.isComputer()){  // human !
		   // see if they will switch	
			
			myPlayer.setToSwitch(myGetYesNo("Do you wish to switch to box " + switchBox + "?",scn)); 
		}
	
		/// now switch
		if(myPlayer.isToSwitch()){
			
			playerBox = switchBox;
			System.out.println("Player has switched to box " + playerBox);
			
		} else
		{
			System.out.println("OK - no switch. We will stick to box " + playerBox);
	
   			
		}
		
		
		if(myBoxes.getBoxContents(playerBox) == "Car"){
			System.out.println("Congratulations !!!!");
			System.out.println("You have won a car !!!!");
			

					} else{
			System.out.println("Bad luck, you have won a goat...");
			
			
			
		}
		
		System.out.println("************");
		
		System.out.println("Box 1 " + myBoxes.getBoxContents(1));
		System.out.println("Box 2 " + myBoxes.getBoxContents(2));
		System.out.println("Box 3 " + myBoxes.getBoxContents(3));
					
			
		// close resources		
		scn.close();
		
		
		
		
	}
	
	
	
	 public static int boxChoice(Scanner scn, String msg) {

	        int selection;
	       
	       
	        System.out.println(msg);
	        System.out.println("---------\n");
	        System.out.println("1");
	        System.out.println("2");
	        System.out.println("3");
	        
	        
	        selection = scn.nextInt();
	        return selection;    
	    }
	
	 
	 static Player getPlayer(Scanner scn){
		 
		 String name;
		 
		 System.out.println("Enter a name (or press enter and the computer will play!)");
	     System.out.println("---------\n");
	     
	     name = scn.nextLine();
		 
	     if(name.equals("") || name == null){
	    	 // computer
	    	 return new Player();
	    	 
	     } else {
	    	 // person !
	    	 return new Player(name);
		    	 
	     }
		 
	 }
	 
	 
	 
	   /// simple random number generator that gives a random value between two ranges
		// INPUT: minValue , maxValue
		
		static int randomValue(int minValue, int maxValue)
		{
		   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
		   
		   return (int)(Math.random() * range) + minValue;
		}
		

		// Mygetyesno
		// gets the user input from keyboard, must be y or n
		/// uses the java scanner object and console output to prompt the user for input
		static boolean myGetYesNo(String userMsg, Scanner s){
			
		    /// set initial values
		    String returnStr = "";
		    boolean response = false;
		    
			
		    do {
		    	System.out.println(userMsg + " please enter y or n");
		    	returnStr =  s.next(); // read scanner input into string
		    	
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
