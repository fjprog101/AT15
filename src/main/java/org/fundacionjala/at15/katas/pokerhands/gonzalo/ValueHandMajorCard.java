package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandMajorCard extends RankedHand {
    private String cardMajor;
    private int pos;
    private char[] majorCard;
    private int[] majorCardInt;
    private Converter valueCard = new Converter();
    private Compare compare = new Compare();

    public String rankedHand(String[] hand) {
        pos = position(hand);
        if (compare.compareSuit(hand) && compare.compareCard1(hand) && compare.compareCard2(hand)
            && compare.compareCard3(hand) && compare.compareCard4(hand) && !compare.isStraight(hand)) {
            cardMajor =  hand[pos];
        }
        return cardMajor;
    }

    public int position(String[] hand) {
        majorCard = valueCard.converterCharValue(hand);
        majorCardInt = valueCard.converterInt(majorCard);
        return valueCard.getPositionMajorCard(majorCardInt);
    }
}