package javalab.day8.mediaLibrary.Library;

public class BlueRay extends Film {

	private boolean blueRayExtras;
	
	

	public BlueRay(String name, int runningTime, String director, String genre,	boolean blueRayExtras) {
		super(name, runningTime, director, genre);
		this.blueRayExtras = blueRayExtras;
	}

	public boolean getBlueRayExtras() {
		return blueRayExtras;
	}

	public void setBlueRayExtras(boolean blueRayExtras) {
		this.blueRayExtras = blueRayExtras;
	}

	public BlueRay() {
		// TODO Auto-generated constructor stub
		
		
	}

	@Override public String toString(){
		return super.toString();
		
	}
}
