
public class Blackjack {

	public static void main(String[] args) {
		Deck deck1 = new Deck();
		deck1.shuffle(1);
		deck1.printDeck();
		System.out.println();
		deck1.shuffle(2);
		deck1.printDeck();
	}

}
