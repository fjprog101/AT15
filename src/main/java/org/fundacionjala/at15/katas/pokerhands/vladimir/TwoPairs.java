package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class TwoPairs extends PokerHands {

    @Override
    public String run(Hand blackHand, Hand whiteHand) {
        Card[] cardsBlackHand = new Card[2];
        cardsBlackHand = getTwoPairs(blackHand.getCards());
        Card[] cardsWhiteHand = new Card[2];
        cardsWhiteHand = getTwoPairs(whiteHand.getCards());
        Card highCardBlackHand = getHigh(cardsBlackHand);
        Card highCardWhiteHand = getHigh(cardsWhiteHand);
        if (highCardBlackHand.getValue() > highCardWhiteHand.getValue()) {
            return "Black hand wins";
        } else {
            return "White hand wins";
        }
    }

    public Card getHigh(Card[] twoCards) {
        if (twoCards[0].getValue() > twoCards[1].getValue()) {
            return twoCards[0];
        } else {
            return twoCards[1];
        }
    }

    public Card[] getTwoPairs(Card[] card) {
        int numAuxI;
        int numAuxJ;
        int aux;
        Card[] auxCard = new Card[2];
        Pair pair = new Pair();
        auxCard[0] = pair.getPair(card);
        int pos2 = 0;
        for (int ind = 0; ind < card.length; ind++) {
            for (int indj = ind + 1; indj < card.length; indj++) {
                numAuxI = card[ind].getValue();
                numAuxJ = card[indj].getValue();
                aux = auxCard[0].getValue();
                if (numAuxI == numAuxJ && aux != numAuxI && aux != numAuxJ) {
                    pos2 = ind;
                }
            }
        }
        auxCard[1] = card[pos2];
        return auxCard;
    }
}
