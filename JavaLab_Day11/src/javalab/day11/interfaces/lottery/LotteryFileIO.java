package javalab.day11.interfaces.lottery;

import java.io.IOException;

public interface LotteryFileIO {

	public void saveTheWeek(int[][] arr) throws IOException;
   	public void loadTheWeek (int[][] arr) throws IOException;
	
	
	
}
