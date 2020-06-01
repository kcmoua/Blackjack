
public class Card {
	// instantiated variables
	private Denom denom;
	private Suit suit;
	
	// constructor
	public Card(Suit suit, Denom denom) {
		this.suit = suit;
		this.denom = denom;
	}
	
	// methods
	public void displayCard() {
		System.out.println(this.suit + " OF " + this.denom);
	}
	
	public Denom getDenom() {
		return this.denom;
	}
	
	public void setDenom(Denom denom) {
		this.denom = denom;
	}
	
	public Suit getSuit() {
		 return this.suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
}
