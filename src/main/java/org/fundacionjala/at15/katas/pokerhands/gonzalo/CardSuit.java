package org.fundacionjala.at15.katas.pokerhands.gonzalo;

import java.util.ArrayList;
import java.util.List;

public class CardSuit extends Cards {
    private final int numberOfCards = 13;
    private List<String> suitCard;

    public List<String> cards(String suit) {
        suitCard = new ArrayList<String>();
        int valueCard = 2;
        final int value10 = 10;
        final int value11 = 11;
        final int value12 = 12;
        final int value13 = 13;
        final int value14 = 14;
        for (int ind = 0; ind < numberOfCards; ind++) {
            if (valueCard < value10) {
                suitCard.add(valueCard + suit);
            } else if (valueCard == value10) {
                String valueC = "T";
                suitCard.add(valueC + suit);
            } else if (valueCard == value11) {
                String valueC = "J";
                suitCard.add(valueC + suit);
            } else if (valueCard == value12) {
                String valueC = "Q";
                suitCard.add(valueC + suit);
            } else if (valueCard == value13) {
                String valueC = "K";
                suitCard.add(valueC + suit);
            } else if (valueCard == value14) {
                String valueC = "A";
                suitCard.add(valueC + suit);
            }
            valueCard++;
        }
        return suitCard;
    }
}