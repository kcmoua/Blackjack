
public class Blackjack {

	public static void main(String[] args) {
		Deck deck1 = new Deck();
		deck1.getTopCard().displayCard();
		deck1.shuffle(2);
		deck1.getTopCard().displayCard();
		deck1.printDeck();
	}

}
