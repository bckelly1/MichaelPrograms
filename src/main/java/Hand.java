

// Import needed utility. 

import java.util.ArrayList;

public class Hand {
    // Declare arrayList of objects(cards) named currentHand.
    ArrayList<Card> currentHand = new ArrayList<Card>();

    // Declares Hand constructor.
    public Hand(ArrayList<Card> hand) {
        currentHand = hand;
    }

    // Declares addCard method.
    public void addCard(Card card) {
        // Adds card to ArrayList currentHand.
        currentHand.add(card);
    }

    // Declares removeCard method.
    public void removeCard(Card card) {
        // Removes card from ArrayList currentHand.
        currentHand.remove(card);
    }

    // Declares method to print out the current hand.
    public void showHand() {
        // Increments fro the size of the currentHand until
        // all elements have been displayed.
        for (int i = 0; i < currentHand.size(); i++) {
            System.out.println(currentHand.get(i).retrieveName());
        }
    }

}