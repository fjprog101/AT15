package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class Pair extends PokerHands {

    @Override
    public String run(Hand blackHand, Hand whiteHand) {
        Card highCardBlackHand = getPair(blackHand.getCards());
        Card highCardWhiteHand = getPair(whiteHand.getCards());
        if (highCardBlackHand.getValue() > highCardWhiteHand.getValue()) {
            return "Black hand wins";
        } else {
            return "White hand wins";
        }
    }

    public Card getPair(Card[] card) {
        int numAuxI;
        int numAuxJ;
        int pos = 0;
        for (int ind = 0; ind < card.length; ind++) {
            for (int indj = ind + 1; indj < card.length; indj++) {
                numAuxI = card[ind].getValue();
                numAuxJ = card[indj].getValue();
                if (numAuxI == numAuxJ) {
                    pos = ind;
                }
            }
        }
        return card[pos];
    }

    public int isPair(Hand hand) {
        Card[] cards = hand.getCards();
        int numAuxI;
        int numAuxJ;
        int value = 0;
        int count = 0;
        for (int ind = 0; ind < cards.length; ind++) {
            for (int indj = ind + 1; indj < cards.length; indj++) {
                numAuxI = cards[ind].getValue();
                numAuxJ = cards[indj].getValue();
                if (numAuxI == numAuxJ) {
                    count++;
                }
            }
        }
        if (count == 1) {
            value = 1;
        }
        return value;
    }
}
