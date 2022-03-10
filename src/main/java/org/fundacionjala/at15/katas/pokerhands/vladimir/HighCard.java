package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class HighCard extends PokerHands {

    public String run(Hand blackHand, Hand whiteHand) {
        Card highCardBlackHand = getHighCard(blackHand.getCards());
        Card highCardWhiteHand = getHighCard(whiteHand.getCards());
        if (highCardBlackHand.getValue() > highCardWhiteHand.getValue()) {
            return "Black hand wins";
        } else {
            return "White hand wins";
        }
    }

    public Card getHighCard(Card[] card) {
        int high = 0;
        int numAux;
        int pos = 0;
        for (int ind = 0; ind < card.length; ind++) {
            numAux = card[ind].getValue();
            if (high < numAux) {
                high = numAux;
                pos = ind;
            }
        }
        return card[pos];
    }
}