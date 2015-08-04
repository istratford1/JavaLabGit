package markers;

public class Nought extends Marker {

	private static Nought instance;

	private Nought() {
		this.setMark('0');
	}

	public static Nought getInstance() {

		if (instance == null) {
			instance = new Nought();
		}
		return (Nought) instance;
	}

}
