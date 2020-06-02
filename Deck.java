import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	// instantiated variables
	private ArrayList<Card> deckOfCards;
	private int topCardPos;

	// constructor
	public Deck() {
		this.deckOfCards = new ArrayList<Card>();	// create ArrayList of Card objects
		
		for(Suit suitValue:Suit.values()) {			// iterate through Suit enum
			for(Value value:Value.values()) {	// iterate through Value enum
				this.deckOfCards.add(new Card(suitValue, value));		// create new Card object with current suit and denom values
			}
		}
		this.topCardPos = 0;		// set position of top Card to 0
	}
	
	// methods
	public void shuffle(int n) {	// pass in number of shuffles
		for(int i=0;i<n;i++) {		// loop 
			Collections.shuffle(deckOfCards);		// randomly reorganize ArrayList
		}
		this.topCardPos = 0;		// set position of top Card to 0
	}
	
	public int getTopCardPos() {
		return this.topCardPos;		// return current top Card position
	}
	
	public Card getTopCard() {
		int currentTopCard = topCardPos;		// set current top Card position to variable that is returned
		topCardPos += 1;			// iterate top Card number
		return deckOfCards.get(currentTopCard);
	}
	
	public void printDeck() {
		for(Card cards:deckOfCards) {
			cards.displayCard();
		}
	}
	
}
