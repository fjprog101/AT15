package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandMajorCard extends RankedHand {
    private boolean cardMajor;
    private char[] majorCard;
    private int[] majorCardInt;
    private Converter valueCard = new Converter();
    private Compare compare = new Compare();

    public boolean rankedHand(String[] hand) {
        if (!compare.compareSuit(hand) && !compare.isStraight(hand) && compare.cardNoSameValue(hand)) {
            cardMajor =  true;
        }
        return cardMajor;
    }

    public int position(String[] hand) {
        majorCard = valueCard.converterCharValue(hand);
        majorCardInt = valueCard.converterInt(majorCard);
        return valueCard.getPositionMajorCard(majorCardInt);
    }
}