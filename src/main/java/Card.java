

public class Card {
    // Declares private Strings rank and suit.
    private String rank = "";
    private String suit;

    // Declares card constructor fro random generation from tester.
    public Card(String stRank) {
        String[] temp = stRank.split("");
        suit = temp[temp.length - 1];
        for (int i = 0; i < temp.length - 1; i++) {
            rank += temp[i];
        }

    }

    // Declares hashMap initializer to generate all the ranks
    // and assign them their int values.
    public void initializeHashMaps() {
        Rank.makeFull();
    }

    // Retrieves the rank of a card and parses the response
    // into an integer value.
    public String retrieveRank() {
        return Rank.numberToRank(Integer.parseInt(rank));
    }

    // Retrieves the suit of a card and leaves the value
    // as a string.
    public String retrieveSuit() {
        return Suit.retrieveFullType(suit);
    }

    // Retrieves the suit abbrev of a card and leaves
    // the value as a string.
    public String retrieveAbbreviation() {
        return suit;
    }

    // Retrieves the name of a card by combining the
    // rank and suit of the card as retrieved above.
    public String retrieveName() {
        return Rank.fullRank.get(Integer.parseInt(rank)) + " of " + Suit.fullSuit.get(suit);
    }

}