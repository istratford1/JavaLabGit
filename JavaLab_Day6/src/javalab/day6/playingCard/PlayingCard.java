package javalab.day6.playingCard;


// playing card is a type of card with rank and suit
// the card must be instantiated with a rank and suit - the card cannot exist without both
public class PlayingCard extends Card {
	
	private Suit suit;
	private Rank rank;
	
	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	
	
	// playing card MUST have rank & suit
	public PlayingCard(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	
	
}
