package markers;


public class Cross extends Marker {

	private static Cross instance;

	private Cross() {
		this.setMark('X');
	}


	public static Cross getInstance() {

		if (instance == null) {
			instance = new Cross();
		}
		return (Cross) instance;
	}

}
