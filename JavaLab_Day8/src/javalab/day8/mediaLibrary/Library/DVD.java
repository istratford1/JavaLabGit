package javalab.day8.mediaLibrary.Library;

import java.util.Date;

public class DVD extends Film {
    
	private int ISOnum;
	
	
	
	public DVD(String name, int runningTime, String director, String genre) {
		super(name, runningTime, director, genre);
		// TODO Auto-generated constructor stub
	}



	public int getISOnum() {
		return ISOnum;
	}



	public void setISOnum(int iSOnum) {
		ISOnum = iSOnum;
	}



	public DVD() {
		// TODO Auto-generated constructor stub
	}
	
	@Override public String toString(){
		return super.toString();
		
	}

}
