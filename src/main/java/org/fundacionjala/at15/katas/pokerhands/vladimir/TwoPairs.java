package org.fundacionjala.at15.katas.pokerhands.vladimir;

public class TwoPairs extends PokerHands{

    @Override
    public String run(Hand blackHand, Hand whiteHand) {
        // TODO Auto-generated method stub
        return null;
    }

    public Card[] twoPairs(Card[] card) {
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
