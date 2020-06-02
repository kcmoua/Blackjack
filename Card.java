
public class Card {
	// instantiated variables
	private Value value;
	private Suit suit;
	
	// constructor
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	// methods
	public void displayCard() {
		System.out.println(this.suit + " OF " + this.value);
	}
	
	public Value getValue() {
		return this.value;
	}
	
	public void setvalue(Value value) {
		this.value = value;
	}
	
	public Suit getSuit() {
		 return this.suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
}
