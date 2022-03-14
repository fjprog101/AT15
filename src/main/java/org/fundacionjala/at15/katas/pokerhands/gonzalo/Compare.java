package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class Compare {
    private final int card1 = 0;
    private final int difference = 4;
    private int max;
    private int min;
    private Converter valueCard = new Converter();
    private char[] majorCard;
    private int[] cardsInt;

    public boolean compareSuit(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharSuit(hand);
        if (xCardsHaveTheSameValue(majorCard, card1) == difference) {
            verified = true;
        }
        return verified;
    }

    public int xCardsHaveTheSameValue(char[] hand, int initialCard) {
        int count = 0;
        int initial =  initialCard + 1;
        for (int ind = initial; ind < hand.length; ind++) {
            if (hand[initialCard] == hand[ind]) {
                count++;
            }
        }
        return count;
    }

    public boolean isStraight(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharValue(hand);
        cardsInt = valueCard.converterInt(majorCard);
        max = valueCard.getPositionMajorCard(cardsInt);
        min = valueCard.getPositionMinorCard(cardsInt);
        if (cardsInt[max] - cardsInt[min] == difference) {
            verified = true;
        }
        return verified;
    }

    public boolean cardNoSameValue(String[] hand) {
        final int sameValue = 0;
        int count = 0;
        boolean verified = false;
        majorCard = valueCard.converterCharValue(hand);
        for (int ind = 0; ind < majorCard.length; ind++) {
            count = count + xCardsHaveTheSameValue(majorCard, ind);
        }
        if (count == sameValue) {
            verified = true;
        }
        return verified;
    }
}