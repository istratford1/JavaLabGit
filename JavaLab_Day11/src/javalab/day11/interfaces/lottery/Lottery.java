package javalab.day11.interfaces.lottery;

import java.io.IOException;
import java.util.*;

public class Lottery {

	
	public static void main(String[] args) throws IOException{
		
		
	
		
	    LotteryWeek lw = new LotteryWeek();
	    lw.generateWeek();
	    
	    lw.showNums("Just Generated");
	    
	   
		lw.saveWeek();
			    
	    
	    lw.loadWeek();
	    
	    lw.showNums("Loaded back from file");
		    
	    		
		
		
		
		
		
	}	

	

	
	
	
	
}
