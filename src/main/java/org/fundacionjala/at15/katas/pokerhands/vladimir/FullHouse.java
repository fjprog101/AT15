package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class FullHouse extends PokerHands {

    @Override
    public String sameHandComparation(Hand blackHand, Hand whiteHand) {
        Card highCardBlackHand = getFullHouse(blackHand.getCards());
        Card highCardWhiteHand = getFullHouse(whiteHand.getCards());
        if (highCardBlackHand.getValue() > highCardWhiteHand.getValue()) {
            return "Black hand wins";
        } else {
            return "White hand wins";
        }
    }

    public Card getFullHouse(Card[] card) {
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
                if (count == 2) {
                    pos = indj;
                    break;
                }
            }
        }
        return card[pos];
    }

    public int isFullHouse(Hand hand) {
        Card[] cards = hand.getCards();
        int numAuxI;
        int numAuxJ;
        int aux = 0;
        int value = 0;
        int count = 0;
        int count2 = 0;
        for (int ind = 0; ind < cards.length; ind++) {
            for (int indj = ind + 1; indj < cards.length; indj++) {
                numAuxI = cards[ind].getValue();
                numAuxJ = cards[indj].getValue();
                if (numAuxI == numAuxJ) {
                    aux = numAuxI;
                    count++;
                }
            }
            if (count == 1) {
                break;
            } else if (count == 2) {
                break;
            }
        }
        if (count == 2 || count == 1) {
            for (int ind = 0; ind < cards.length; ind++) {
                for (int indj = ind + 1; indj < cards.length; indj++) {
                    numAuxI = cards[ind].getValue();
                    numAuxJ = cards[indj].getValue();
                    if (numAuxI == numAuxJ && numAuxI != aux) {
                        count2++;
                    }
                }
                if (count2 == 1) {
                    break;
                } else if (count2 == 2) {
                    break;
                }
            }
        }
        if ((count == 2 && count2 == 1) || (count == 1 && count2 == 2)) {
            value = handValue7;
        }
        return value;
    }
}
