
// Import needed utilities. 

import java.util.ArrayList;
import java.util.Random;

public class Tester7 {

    /**
     * ================================GOALS===============================
     * Table
     * ---- 4(?) hands
     * ---- Table's count (5 max? I think?)
     * Deck
     * -- 52 cards -- static instance, all hands pull from same deck
     * ---- 4 Suits
     * ---- Each Suit's Rank
     * Hand
     * ---- Retrieve 5 random cards from the deck
     * ----Deck no longer contains those cards
     * Suit
     * ---- Contains 1 Rank
     * ---- There are 4 types of Suits; Spades, Clubs, Hearts, Diamonds
     * Rank
     * ---- Ace, 1-9, Jack, Queen, King, Ace(?)
     * ======================================================================
     */
    public static void main(String[] args) {
        // Initialize needed HashMaps.
        Rank.makeFull();
        Suit.makeFull();

        // Generate the ArrayList of cards.
        ArrayList<Card> generatedHand = new ArrayList<Card>();
        Random rand = new Random();// Generate/Set random number.
        for (int i = 0; i < 5; i++) {// Increment card generation for 5 cards.
            generatedHand.add(generateCard(generatedHand));
        }
        // Declare new hand, hand, and generate the hand.
        Hand hand = new Hand(generatedHand);

        // Print out the generated hand to user.
        hand.showHand();
        System.out.println();

        hand.addCard(generateCard(generatedHand));// Add card to the generated hand.
        hand.showHand();// Show the added card and the new hand to user.

        hand.removeCard(generatedHand.get(rand.nextInt(generatedHand.size() - 1))); // Remove a card from the hand.    //TODO negative underflow
        System.out.println();// Show the user the new changed hand.
        hand.showHand();
        //System.out.println(generatedHand.get(3).retrieveSuit());

    }

    // How to generate the cards within the hand using random
    // generation. Called above when initializing the hand.     TODO this generates a hand, not a card
    public static Card generateCard(ArrayList<Card> gen) {
        // Declare the randoms suit/rank.
        Random suit = new Random();
        Random rank = new Random();
        // Declare the strings makeRank/Suit as empty strings.
        String makeRank = "";
        String makeSuit = "";
        // Increment for 5 cards.
        for (int i = 0; i < 5; i++) {
            // Generates card by retrieving enum types from rank/suit files.
            makeRank = "" + (rank.nextInt(13) + 1);
            makeSuit = Suit.getShort(suit.nextInt(4));

        }
        // Creates new card object using random rank/suit values generated above.
        Card card = new Card(makeRank + makeSuit); //TODO rank+suit makes no sense

        if (gen.contains(card)) {// Checks for card duplicates.
            generateCard(gen);
        } else {
            return card;
        }
        return null;
    }

}
