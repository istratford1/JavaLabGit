package javalab.day2;

import static java.lang.System.out;

import java.util.Scanner;

/// simple count incrementing from 1 to 1000....
public class Day2_SimpleCount {
	
	public static void main(String[] args){

		
		for(int i=1;i <= 100; i++){
			/// only even numbers, comma separated
			if(i % 2 == 0){
		     out.print(i + ",");
				
			}
			
		}
		
		
		
	}
	
	
}


