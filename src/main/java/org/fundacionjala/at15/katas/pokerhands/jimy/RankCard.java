package org.fundacionjala.at15.katas.pokerhands.jimy;

public class RankCard {
    private final int numCards = 5;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int fourteen = 14;
    public boolean hasPair(PokerHand player) {
        for (int index = 0; index < numCards - 1; index++) {
            if (isPair(player.getCard(index), player.getCard(index + 1))) {
                return true;
            }
        }
        return false;
    }
    public boolean hasTwoPair(PokerHand player) {
        for (int index = 0; index < numCards - three; index++) {
            if (isPair(player.getCard(index), player.getCard(index + 1))) {
                for (int jIndex = index + 2; jIndex < numCards - 1; jIndex++) {
                    if (isPair(player.getCard(jIndex), player.getCard(jIndex + 1))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean hasThreeOfAKind(PokerHand player) {
        for (int index = 0; index < numCards - 2; index++) {
            if (isThreeOfAKind(player.getCard(index), player.getCard(index + 1), player.getCard(index + 2))) {
                return true;
            }
        }
        return false;
    }
    public boolean isThreeOfAKind(Card card1, Card card2, Card card3) {
        return card1.getValue() == card2.getValue() && card2.getValue() == card3.getValue();
    }
    public boolean hasStraight(PokerHand player) {
        for (int index = numCards - 1; index > 0; index--) {
            int one = player.getValue(index);
            int two = player.getValue(index - 1);
            if (one == fourteen && two == five) {
                continue;
            }
            if (one - two != 1) {
                return false;
            }
        }
        return true;
    }
    public boolean hasFlush(PokerHand player) {
        for (int index = 0; index < numCards - 1; index++) {
            if (player.getSuit(index) != player.getSuit(index + 1)) {
                return false;
            }
        }
        return true;
    }
    public boolean hasFullHouse(PokerHand player) {
        return (isPair(player.getCard(0), player.getCard(1))
            && isThreeOfAKind(player.getCard(2), player.getCard(three), player.getCard(four))
            || isPair(player.getCard(three), player.getCard(four))
            && isThreeOfAKind(player.getCard(0), player.getCard(1), player.getCard(2)));
    }
    public boolean hasFourOfAKind(PokerHand player) {
        for (int index = 0; index < numCards - three; index++) {
            if (isThreeOfAKind(player.getCard(index), player.getCard(index + 1), player.getCard(index + 2))
                && isPair(player.getCard(index + 2), player.getCard(index + three))) {
                return true;
            }
        }
        return false;
    }
    public boolean hasStraightFlush(PokerHand player) {
        return hasFlush(player) && hasStraight(player);
    }
    public boolean isPair(Card card1, Card card2) {
        return card1.getValue() == card2.getValue();
    }
}
