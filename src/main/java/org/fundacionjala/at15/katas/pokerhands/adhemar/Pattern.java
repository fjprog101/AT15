package org.fundacionjala.at15.katas.pokerhands.adhemar;

import java.util.ArrayList;

public class Pattern {
    private Card[] cards;
    private ArrayList<Group> groups;

    public Pattern(Card[] cards) {
        this.cards = cards;
        this.groups = new Grouper(this.cards).getGroups();
    }

    public boolean isAllSameSuit() {
        String prevSuit = this.cards[0].getSuit();
        for (Card card : this.cards) {
            if (prevSuit != card.getSuit()) {
                return false;
            }
            prevSuit = card.getSuit();
        }
        return true;
    }

    public boolean isContinuous() {
        int prevValue = this.cards[0].calculateValue() - 1;
        for (Card card : this.cards) {
            if (card.calculateValue() != prevValue + 1) {
                return false;
            }
            prevValue = card.calculateValue();
        }
        return true;
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
            if (group.getQuantity() == Card.FOUR) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullHouse() {
        boolean isThereTriple = false;
        boolean isPair = false;
        for (Group group : this.groups) {
            if (group.getQuantity() == Card.THREE) {
                isThereTriple = true;
            }
            if (group.getQuantity() == Card.TWO) {
                isPair = true;
            }
        }
        return isThereTriple && isPair;
    }

    public boolean isThreeOfAKind() {
        for (Group group : this.groups) {
            if (group.getQuantity() == Card.THREE) {
                return true;
            }
        }
        return false;
    }

    public boolean isTwoPairs() {
        int pairs = 0;
        for (Group group : this.groups) {
            if (group.getQuantity() == Card.TWO) {
                pairs++;
            }
        }
        if (pairs == Card.TWO) {
            return true;
        }
        return false;
    }
}
