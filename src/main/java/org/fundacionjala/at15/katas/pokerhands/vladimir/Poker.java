package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class Poker extends PokerHands {

    @Override
    public String run(Hand blackHand, Hand whiteHand) {
        Card highCardBlackHand = getPoker(blackHand.getCards());
        Card highCardWhiteHand = getPoker(whiteHand.getCards());
        if (highCardBlackHand.getValue() > highCardWhiteHand.getValue()) {
            return "Black hand wins";
        } else {
            return "White hand wins";
        }
    }

    public Card getPoker(Card[] card) {
        int numAuxI;
        int numAuxJ;
        int pos = 0;
        int count = 0;
        for (int ind = 0; ind < card.length; ind++) {
            for (int indj = ind + 1; indj < card.length; indj++) {
                numAuxI = card[ind].getValue();
                numAuxJ = card[indj].getValue();
                if (numAuxI == numAuxJ) {
                    count++;
                }
                if (count == 2 + 1) {
                    pos = indj;
                    break;
                }
            }
        }
        return card[pos];
    }

    public int isPoker(Hand hand) {
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
            if (count == index1 || count == index2) {
                break;
            } else if (count == index3) {
                value = handValue8;
                break;
            }
        }
        return value;
    }
}
