package markers;

/**
 * Abstract class. Sub-classes will be required pieces for playing noughts and crosses. Mark to 
 * be made on the board is held by a char
 * 
 * @author JBWatson
 *
 */
public abstract class Marker {
	
	private char mark;

	public char getMark() {
		return mark;
	}

	public void setMark(char mark) {
		this.mark = mark;
	}
	
	
	
	
}
