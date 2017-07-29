
// Imports needed utility.
import java.util.HashMap;

public class Suit {
    // Declares the fullSuit HashMap.
    static HashMap<String, String> fullSuit = new HashMap<String, String>();
    // Declares the enum type suitList.
    final static String[] suitList =
            {"Clubs", "Diamonds", "Hearts", "Spades"};

    // Dcelcares a shorthand version of suitList.
    final static String[] shortSuitList =
            {"c", "d", "h", "s"};

    // Declares method used to generate suitType from
    // supplied random int.
    public static String numberToSuit(int n) {
        return suitList[n]; //TODO bounds check
    }

    // Generates short/longhand version of suit for
    // each card when called in hand generation.
    public static void makeFull() {
        fullSuit.put(shortSuitList[1], suitList[1]);
        fullSuit.put(shortSuitList[2], suitList[2]);
        fullSuit.put(shortSuitList[3], suitList[3]);
        fullSuit.put(shortSuitList[4], suitList[4]);
    }

    // Retrieves the suitType of a fullsuit from supplied int.
    public static String retrieveFullType(int n) {
        return fullSuit.get(numberToSuit(n));
    }

    // Retrieves suitType from supplied string.
    public static String retrieveFullType(String n) {
        return fullSuit.get(n);
    }

    // Used to generate card in hand generation.
    public static String getShort(int n) {
        return shortSuitList[n];
    }
}