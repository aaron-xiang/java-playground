package playground.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayingCard {
    private List<String> deck = new ArrayList<>();

    public PlayingCard(int numberOfDecks) {
        reset(numberOfDecks);
    }

    public void reset(int numberOfDecks) {
        for (int n = 0; n < numberOfDecks; n++) {
            for (int i = 1; i <= 13; i++) {
                deck.add(i + "s");
                deck.add(i + "h");
                deck.add(i + "d");
                deck.add(i + "c");
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < 100; i++) {
            int[] c = getTwoRandomNumbers();
            swapCards(c[0], c[1]);
        }
    }

    public List<String> draw(int numberOfCards) {
        List<String> hand = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            String c = deck.get(i);
            hand.add(c);
        }
        deck.removeAll(hand);
        return hand;
    }

    private int[] getTwoRandomNumbers() {
        int[] r = {0, 0};
        Random random = new Random();
        while (r[0] == 0 && r[1] == 0) {
            r[0] = random.nextInt(52);
            r[1] = random.nextInt(52);
        }
        return r;
    }

    public int size() {
        return deck.size();
    }

    private void swapCards(int n1, int n2) {
        String c = deck.get(n1);
        deck.set(n1, deck.get(n2));
        deck.set(n2, c);
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "deck=" + deck +
                '}';
    }
}
