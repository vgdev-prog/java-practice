import java.util.*;

public class Deck {
   private final Deque<Card> deck;

    public Deck() {
        deck = new ArrayDeque<>();
        this.generateDeck();
    }

    public void shuffle() {
        List<Card> cards = new ArrayList<>(deck);
        Collections.shuffle(cards);

        deck.clear();
        deck.addAll(cards);
    }

    public List<Card> getCards() {
        return List.copyOf(deck);
    }

    public Card dealHand() {
        return this.deck.removeFirst();
    }

    private void generateDeck() {
        for (Rank rank : Rank.values()) {
            for (Suite suite : Suite.values()) {
                deck.push(new Card(rank, suite));
            }
        }

        this.shuffle();
    }


}
