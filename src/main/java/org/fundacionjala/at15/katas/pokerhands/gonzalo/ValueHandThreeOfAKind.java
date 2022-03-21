package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandThreeOfAKind extends RankedHand {

    private int count = 0;
    private final int three = 3;
    private boolean valueThree;
    private Converter valueCard = new Converter();
    private Compare compare = new Compare();

    public boolean rankedHand(String[] hand) {
        char[] value = valueCard.converterCharValue(hand);
        for (int ind = 0; ind < value.length; ind++) {
            count = count + compare.xCardsHaveTheSameValue(value, ind);
        }
        if (count == three) {
            valueThree = true;
        }
        return valueThree;
    }
}
