package javalab.day3;

public class Day3_Recursion {

	public static void main(String[] args){
		
		System.out.println("Power(3,3) = " + power(3,3));
		
		
		
	}
	
	
	static Integer power(int base, int exponent){
		
		
		while(exponent > 1){
		    						
		    base = base * base;
			exponent --;
		}
		
		return base;
				
		
	}
	
	
	
}
