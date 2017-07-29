

// Import needed utility. 

import java.util.HashMap;

public class Rank {
    // Declares the HashMap fullRank, includes int and string.
    static HashMap<Integer, String> fullRank = new HashMap<Integer, String>();

    // Declares enum type rankNumber of ints, 0-14.
    final static int[] rankNumber =
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    // Declares enum type rankList of strings.
    final static String[] rankList =
            {"EMPTY", "LOWACE", "_2", "_3", "_4", "_5", "_6", "_7", "_8", "_9", "_10", "JACK", "QUEEN", "KING", "ACE"};

    // Declares enum type rankName of strings.
    final static String[] rankName =
            {"Empty", "Low Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

    // Declares method to convert int randk into string rank.
    public static String numberToRank(int n) {
        return rankList[n];
    }

    // Declares method to retrieve rank using a supplied int.
    public static int retrieveRank(int n) {
        return rankNumber[n];
    }

    // Declares method to assign int values to each string of the enum types.
    public static void makeFull() {
        for (int i = 0; i <= 14; i++) {
            fullRank.put(i, rankName[i]);
        }
    }

    // Retrieves rank of card based on supplied int.
    public static String retrieveFull(int n) {
        return fullRank.get(numberToRank(n));
    }


}