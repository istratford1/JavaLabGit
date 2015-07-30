package javalab.day8.mediaLibrary.Library;

import java.util.Date;

public class DigitalFilm extends Film{

	private String formatType;
	private String downloadLink;
	
	
	

	public DigitalFilm() {
		// TODO Auto-generated constructor stub
	}
	
	public DigitalFilm(String name, int runningTime, String director,String genre, String formatType, String downloadLink) {
		super(name, runningTime, director, genre);
		this.formatType = formatType;
		this.downloadLink = downloadLink;
	}

	public void watchOnline(){
		// blah downloadLink
		
		
	}
	


}
