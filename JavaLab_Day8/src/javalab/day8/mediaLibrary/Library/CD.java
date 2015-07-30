package javalab.day8.mediaLibrary.Library;

public class CD extends MediaItem {

	protected String artist;

	protected int numTracks;
	protected int iSRCNum;
	
	public CD(String name, String artist, int numTracks, int iSRCNum) {
		super(name);
		this.artist = artist;
		this.numTracks = numTracks;
		this.iSRCNum = iSRCNum;
	}



	
	
	public CD(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	@Override public String toString(){
		return artist + " |" + super.toString()+ "| " + " Tracks on album: " + numTracks;
		
		
	}

}
