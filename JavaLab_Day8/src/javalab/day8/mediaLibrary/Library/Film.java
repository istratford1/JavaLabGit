package javalab.day8.mediaLibrary.Library;
import java.util.Date;
public abstract class Film extends MediaItem{

	private int runningTime;
	private String Director;
	private String Genre;
	
	
	
	public Film(String name, int runningTime, String director, String genre) {
		super(name);
		this.runningTime = runningTime;
		Director = director;
		Genre = genre;
	}


	public int getRunningTime() {
		return runningTime;
	}


	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}


	public String getDirector() {
		return Director;
	}


	public void setDirector(String director) {
		Director = director;
	}


	public String getGenre() {
		return Genre;
	}


	public void setGenre(String genre) {
		Genre = genre;
	}



	
	
	public Film() {
		// TODO Auto-generated constructor stub
	}

}
