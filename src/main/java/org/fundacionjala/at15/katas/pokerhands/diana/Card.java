package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class Card extends Deck {
    static final int ONE = 1;
    static final int TEN = 10;
    static final int ELEVEN = 11;
    static final int TWELVE = 12;

    public Card(String[] newCompletedHand) {
        super(newCompletedHand);
    }

    public int countCards(String[] hand) {
        int count = hand.length;
        return count;
    }

    public ArrayList<Integer> valueOfCards(String[] hand) {
        ArrayList<Integer> valueOfFirstPosition = new ArrayList<Integer>();
        for (int ind = 0; ind < hand.length; ind++) {
            String valueFirst = hand[ind].substring(0, 1);
            try {
                int value = Integer.parseInt(valueFirst);
                valueOfFirstPosition.add(value);

            } catch (NumberFormatException ex) {
                switch (valueFirst) {
                    case "A":
                        valueOfFirstPosition.add(ONE);
                        break;
                    case "J":
                        valueOfFirstPosition.add(TEN);
                        break;
                    case "Q":
                        valueOfFirstPosition.add(ELEVEN);
                        break;
                    case "K":
                        valueOfFirstPosition.add(TWELVE);
                        break;
                    default:
                }
            }
        }
        return valueOfFirstPosition;
    }

    public ArrayList<String> suitOfCards(String[] hand) {
        ArrayList<String> valueOfSecondPosition = new ArrayList<String>();
        for (int ind = 0; ind < hand.length; ind++) {
            String valueSecond = hand[ind].substring(1, 2);
            valueOfSecondPosition.add(valueSecond);
        }
        return valueOfSecondPosition;
    }
}