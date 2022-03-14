package org.fundacionjala.at15.katas.pokerhands.agustin;
import org.fundacionjala.at15.katas.pokerhands.agustin.Values.Notation;

public class Hand extends CardSet {

    public Hand(Card[] cardCollection) {
        super(cardCollection);
    }

    public boolean pair() {
        for (int aux = 0; aux < getCardCollection().length; aux++) {
            for (int aux1 = 1; aux1 < getCardCollection().length; aux1++) {
                if (getCardCollection()[aux].getValue() == getCardCollection()[aux1].getValue() && aux != aux1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean twoPairs() {
        int pairs = 0;
        for (int aux = 0; aux < getCardCollection().length; aux++) {
            for (int aux1 = 1; aux1 < getCardCollection().length; aux1++) {
                if (getCardCollection()[aux].getValue() == getCardCollection()[aux1].getValue() && aux != aux1) {
                    pairs++;
                }
            }
        }
        return pairs == Notation.TWO.getValue();
    }

    public boolean threeOfAKind() {

        return false;
    }
}

