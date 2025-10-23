import java.util.*;


public class Player {
    public long id;
    public final Map<String, Set<Card>> cards = new LinkedHashMap<>();

    public Player(long id) {
        this.id = id;
    }

    public Map<String, Set<Card>> getCards() {
        return cards;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void playCard(Card card, PlayPile playPile) {
        //show the player his hand

        //selects one card to play

        //a check to see of the color or number matches OR if it is a wildcard

        //return the selected card and then next players turn
    }

    public void takeCard(Card card, DrawPile drawPile) {
        //check if canPlayCard returns any card

        //if none is returned player has to draw a card into the hand

        //return the next players turn
    }

}
