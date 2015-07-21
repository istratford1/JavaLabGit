package javalab.day3;

public class Day3_FibNum {

	
	public static void main(String[] args){

		System.out.println("Fib(4) = " + fib(4));
		

		
	}
	

	public static int fib(int fNum) {
	    if(fNum <= 1) {
		  return 1; // return number 1 as it is the first in the series
		  } else {
		   
			// add the series
			  return fib(fNum - 1) + fib(fNum - 2); 
		  }
		}

}


