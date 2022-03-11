package org.fundacionjala.at15.katas.pokerhands.adhemar;

import java.util.ArrayList;

public class Pattern {
    private Card[] cards;
    private ArrayList<Group> groups;

    public Pattern(Card[] cards) {
        this.cards = cards;
        this.groups = new Grouper(this.cards).getGroups();
    }

    public boolean isHighCard() {
        if (this.groups.size() == Values.FIVE.getValue() && !isFlush()) {
            return true;
        }
        return false;
    }

    public boolean isPair() {
        for (Group group : this.groups) {
            if (this.groups.size() == Values.FOUR.getValue()
                && !isFlush()
                && group.getQuantity() == Values.TWO.getValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean isTwoPairs() {
        int pairs = 0;
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.TWO.getValue()) {
                pairs++;
            }
        }
        if (pairs == Values.TWO.getValue() && !isFlush()) {
            return true;
        }
        return false;
    }

    public boolean isThreeOfAKind() {
        for (Group group : this.groups) {
            if (!isFlush() && group.getQuantity() == Values.THREE.getValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean isOnlyStraight() {
        return isStraight() && !isFlush();
    }

    public boolean isStraight() {
        Card[] sortedCards = CardSorter.sort(this.cards);
        int prevValue = sortedCards[0].calculateValue() - 1;
        for (Card card : sortedCards) {
            if (card.calculateValue() != prevValue + 1) {
                return false;
            }
            prevValue = card.calculateValue();
        }
        return true;
    }

    public boolean isFlush() {
        String prevSuit = this.cards[0].getSuit();
        for (Card card : this.cards) {
            if (prevSuit != card.getSuit()) {
                return false;
            }
            prevSuit = card.getSuit();
        }
        return true;
    }

    public boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    public int calculateTheHighestCard() {
        int high = this.cards[0].calculateValue();
        for (Card card : this.cards) {
            high = card.calculateValue() > high ? card.calculateValue() : high;
        }
        return high;
    }

    public boolean isFourOfAKind() {
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.FOUR.getValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullHouse() {
        boolean isThereTriple = false;
        boolean isPair = false;
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.THREE.getValue()) {
                isThereTriple = true;
            }
            if (group.getQuantity() == Values.TWO.getValue()) {
                isPair = true;
            }
        }
        return isThereTriple && isPair;
    }
}
