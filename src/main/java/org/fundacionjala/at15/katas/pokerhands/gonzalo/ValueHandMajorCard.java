package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHandMajorCard {
    private final int card1 = 0;
    private final int card2 = 1;
    private final int card3 = 2;
    private final int card4 = 3;
    private final int card5 = 4;
    private String cardMajor;
    private int major;
    private int pos;
    private int posAux = 0;
    private char[] majorCard;
    private int[] majorCardInt;
    private Converter valueCard = new Converter();

    public String majorCard(String[] hand) {
        pos = position(hand);
        if (compareSuit(hand) && compareCard1(hand) && compareCard2(hand)
            && compareCard3(hand) && compareCard4(hand)) {
            cardMajor =  hand[pos];
        }
        return cardMajor;
    }

    public int position(String[] hand) {
        majorCard = valueCard.converterCharValue(hand);
        majorCardInt = valueCard.converterInt(majorCard);
        for (int ind = 0; ind < majorCardInt.length; ind++) {
            if (majorCardInt[ind] > major) {
                major = majorCardInt[ind];
                posAux = ind;
            }
        }
        return posAux;
    }

    public boolean compareSuit(String[] hand) {
        boolean verified = false;
        majorCard = valueCard.converterCharSuit(hand);
        if (majorCard[card1] != majorCard[card2] || majorCard[card1] != majorCard[card3]
            || majorCard[card1] != majorCard[card4] || majorCard[card1] != majorCard[card5]) {
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
}