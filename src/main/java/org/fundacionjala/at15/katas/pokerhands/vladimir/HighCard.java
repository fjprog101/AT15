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

    public int isHighCard(Hand hand) {
        Card[] cards = hand.getCards();
        int numAuxI;
        int numAuxJ;
        int value = 0;
        for (int ind = 0; ind < cards.length; ind++) {
            for (int indj = ind + 1; indj < cards.length; indj++) {
                numAuxI = cards[ind].getValue();
                numAuxJ = cards[indj].getValue();
                if (numAuxI == numAuxJ) {
                    value = 0;
                    break;
                } else {
                    value = handValue1;
                }
            }
            if (value == 0) {
                break;
            }
        }
        if (cards[index0].getValue() + 1 == cards[index1].getValue() && cards[index1].getValue() + 1 == cards[index2].getValue()
            && cards[index2].getValue() + 1 == cards[index3].getValue() && cards[index3].getValue() + 1 == cards[index4].getValue()) {
            value = 0;
        }
        if (cards[index0].getSuit() == cards[index1].getSuit() && cards[index1].getSuit() == cards[index2].getSuit()
            && cards[index2].getSuit() == cards[index3].getSuit() && cards[index3].getSuit() == cards[index4].getSuit()) {
            value = 0;
        }
        return value;
    }
}
