package markers;

public class Blank extends Marker {

	private static Blank instance;

	
	
	public Blank() {
		this.setMark('_');
	}

	public static Blank getInstance() {

		if (instance == null) {
			instance = new Blank();
		}
		return instance;
	}

}
