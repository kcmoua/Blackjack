
public class Cards {
	// instantiated variables
    private Suit suit;
    private Value value;
    // constructor
    public Cards(Suit suit, Value value) {
        this.value = value;
        this.suit = suit;
    }
    // methods
    public void displayCard() {
        System.out.println(this.value + " OF " + this.suit);
    }
    // getters
    public Value getValue() {
        return this.value;
    }
    public Suit getSuit() {
        return this.suit;
    }
    // setters
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public void setValue(Value value) {
        this.value = value;
    }
}