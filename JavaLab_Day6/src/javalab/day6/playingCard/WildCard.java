package javalab.day6.playingCard;


// wildcard is a type of card, but does not have rank of suit...
public class WildCard extends Card {

	String wildCardName;
	
	public WildCard(String wildCardName) {
		super();
		this.wildCardName = wildCardName;
	}

	public WildCard() {
		// Default
	}

	
	
}
