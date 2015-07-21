package javalab.day3;

public class Day3_Recursion {

	public static void main(String[] args){
		
		System.out.println("Power(4,4) = " + power(4,4));

		
		
	}
	
	

	
	static Integer power(int base, int exponent){
		
	
		if (exponent == 1){
		  return base;
		}else{
		
		  System.out.println("base " + base);
		  
		  base = base * power(base, exponent-1);
		  
		  return base;
					
		   
		}
				
		
	}
	
	
	

	    	
		
		
	

	
}
