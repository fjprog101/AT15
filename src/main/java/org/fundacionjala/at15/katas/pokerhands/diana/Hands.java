package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class Hands {

    public int countCards(String[] hand) {
        int count = hand.length;
        return count;
    }

    public ArrayList<String> valueOfCards(String[] hand) {
        ArrayList<String> valueOfFirstPosition = new ArrayList<String>();
        for (int ind = 0; ind < hand.length; ind++) {
            String valueFirst = hand[ind].substring(0, 1);
            valueOfFirstPosition.add(valueFirst);
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
