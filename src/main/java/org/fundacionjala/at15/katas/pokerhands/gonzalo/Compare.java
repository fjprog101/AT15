package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class Compare {
    private final int card1 = 0;
    private final int card2 = 1;
    private final int card3 = 2;
    private final int card4 = 3;
    private final int card5 = 4;
    private final int difference = 4;
    private int max;
    private int min;
    private Converter valueCard = new Converter();
    private char[] majorCard;
    private int[] cardsInt;

    public boolean compareSuit(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharSuit(hand);
        if (majorCard[card1] != majorCard[card2] || majorCard[card1] != majorCard[card3]
            || majorCard[card1] != majorCard[card4] || majorCard[card1] != majorCard[card5]) {
            verified = true;
        }
        return verified;
    }

    public boolean compareStraight(String[] hand) {
        boolean verified = false;
        final int diference = 4;
        majorCard = valueCard.converterCharSuit(hand);
        if (majorCard[card5] - majorCard[card1] > diference) {
            verified = true;
        }
        return verified;
    }

    public boolean compareCard1(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharValue(hand);
        if (majorCard[card1] != majorCard[card2] && majorCard[card1] != majorCard[card3]
            && majorCard[card1] != majorCard[card4] && majorCard[card1] != majorCard[card5]) {
            verified = true;
        }
        return verified;
    }

    public boolean compareCard2(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharValue(hand);
        if (majorCard[card2] != majorCard[card3] && majorCard[card2] != majorCard[card4]
            && majorCard[card2] != majorCard[card5]) {
            verified = true;
        }
        return verified;
    }

    public boolean compareCard3(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharValue(hand);
        if (majorCard[card3] != majorCard[card4] && majorCard[card3] != majorCard[card5]) {
            verified = true;
        }
        return verified;
    }

    public boolean compareCard4(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharValue(hand);
        if (majorCard[card4] != majorCard[card5]) {
            verified = true;
        }
        return verified;
    }

    public boolean isStraight(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharValue(hand);
        cardsInt = valueCard.converterInt(majorCard);
        max = valueCard.getPositionMajorCard(cardsInt);
        min = valueCard.getPositionMinorCard(cardsInt);
        if (max - min == difference) {
            verified = true;
        }
        return verified;
    }
}
