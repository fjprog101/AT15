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

/*
package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class Hand {
    private final int limit = 5;
    private final int limitTwoPairs = 4;
    private final int ind1 = 1;
    private final int ind2 = 2;
    private final int ind3 = 3;
    private final int ind4 = 4;
    private final int ind5 = 5;
    private Card[] card = new Card[limit];

    public Hand(Card[] newCard) {
        this.card = newCard;
    }

    public Card highCard() {
        int high = 0;
        int numAux;
        int pos = 0;
        for (int ind = 0; ind < card.length; ind++) {
            numAux = Character.getNumericValue(card[ind].getValue());
            if (Character.isDigit(card[ind].getValue())) {
                if (high < numAux) {
                    high = numAux;
                    pos = ind;
                }
            } else {
                return card[ind];
            }
        }
        return card[pos];
    }

    public Card[] pair() {
        int numAuxI;
        int numAuxJ;
        Card[] auxCard = new Card[2];
        for (int ind = 0; ind < card.length; ind++) {
            for (int indj = ind + 1; indj < card.length; indj++) {
                numAuxI = Character.getNumericValue(card[ind].getValue());
                numAuxJ = Character.getNumericValue(card[indj].getValue());
                if (numAuxI == numAuxJ) {
                    auxCard[0] = card[ind];
                    auxCard[1] = card[indj];
                    break;
                }
            }
        }
        return auxCard;
    }

    public Card[] twoPairs() {
        int numAuxI;
        int numAuxJ;
        int aux;
        Card[] auxCard = new Card[limitTwoPairs];
        Card[] auxCard2 = new Card[2];
        auxCard2 = pair();
        auxCard[0] = auxCard2[0];
        auxCard[1] = auxCard2[1];
        for (int ind = 0; ind < card.length; ind++) {
            for (int indj = ind + 1; indj < card.length; indj++) {
                numAuxI = Character.getNumericValue(card[ind].getValue());
                numAuxJ = Character.getNumericValue(card[indj].getValue());
                aux = Character.getNumericValue(auxCard[0].getValue());
                if (numAuxI == numAuxJ && numAuxI != aux && numAuxJ != aux) {
                    auxCard[ind2] = card[ind];
                    auxCard[ind3] = card[indj];
                }
            }
        }
        return auxCard;
    }
}



*/