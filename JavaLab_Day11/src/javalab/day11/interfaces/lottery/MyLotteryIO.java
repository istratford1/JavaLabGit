package javalab.day11.interfaces.lottery;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyLotteryIO implements LotteryFileIO {
	
	
	String lotteryFilePath = System.getProperty("user.dir") + "\\lottery.txt";
	
	
	@Override
	public void saveTheWeek(int[][] arr) throws IOException {
		// save the 2d lottery array to file
	
		File textFile = new File(lotteryFilePath);
		FileWriter outputStream = new FileWriter(textFile);
		for(int i = 0; i < arr[1].length; i++){
			// write each line
			for(int a = 0; a < arr[1].length; a++){
				String str = String.valueOf(arr[i][a]);
				outputStream.write(str );
				outputStream.write(" "); // space between nums
				
			}
					
			outputStream.write("\n"); // new line between sets
		}
		outputStream.flush(); 
		outputStream.close();
		    
		
	}

	@Override
	public void loadTheWeek(int[][] arr) throws IOException {
		// loads the lottery array from file
        Scanner scn = new Scanner(new File(lotteryFilePath));
    	int i =0;
    	int a = 0;
        arr = new int[7][7]; // initialise array
		while (scn.hasNextLine()){
			// read each line
			Scanner sc2 = new Scanner(scn.nextLine());
			
			while(sc2.hasNext()){
			
				arr[i][a] = sc2.nextInt();
				a++;
				
			}
			
			a = 0;
			i++;
		}
		
	}
	
	
	
}
