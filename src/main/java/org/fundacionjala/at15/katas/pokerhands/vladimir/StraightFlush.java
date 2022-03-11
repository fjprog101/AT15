package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class StraightFlush extends PokerHands {

    @Override
    public String sameHandComparation(Hand blackHand, Hand whiteHand) {
        Card highCardBlackHand = getStraightFlush(blackHand.getCards());
        Card highCardWhiteHand = getStraightFlush(whiteHand.getCards());
        if (highCardBlackHand.getValue() > highCardWhiteHand.getValue()) {
            return "Black hand wins";
        } else {
            return "White hand wins";
        }
    }

    public Card getStraightFlush(Card[] card) {
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

    public int itStraightFlush(Hand hand) {
        Card[] cards = hand.getCards();
        int value = 0;
        if (cards[index0].getValue() + 1 == cards[index1].getValue() && cards[index1].getValue() + 1 == cards[index2].getValue()
            && cards[index2].getValue() + 1 == cards[index3].getValue() && cards[index3].getValue() + 1 == cards[index4].getValue()) {
            value = handValue9;
        }

        if (cards[index0].getSuit() == cards[index1].getSuit() && cards[index1].getSuit() == cards[index2].getSuit()
            && cards[index2].getSuit() == cards[index3].getSuit() && cards[index3].getSuit() == cards[index4].getSuit()
            && value == handValue9) {
            value = handValue9;
        } else {
            value = 0;
        }
        return value;
    }
}
