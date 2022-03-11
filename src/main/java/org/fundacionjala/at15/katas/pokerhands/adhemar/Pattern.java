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
        if (this.groups.size() == Values.FIVE && !isFlush()) {
            return true;
        }
        return false;
    }

    public boolean isPair() {
        for (Group group : this.groups) {
            if (this.groups.size() == Values.FOUR
                && !isFlush()
                && group.getQuantity() == Values.TWO) {
                return true;
            }
        }
        return false;
    }

    public boolean isTwoPairs() {
        int pairs = 0;
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.TWO) {
                pairs++;
            }
        }
        if (pairs == Values.TWO && !isFlush()) {
            return true;
        }
        return false;
    }

    public boolean isThreeOfAKind() {
        for (Group group : this.groups) {
            if (!isFlush() && group.getQuantity() == Values.THREE) {
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
        int prevValue = sortedCards[0].getIntValue() - 1;
        for (Card card : sortedCards) {
            if (card.getIntValue() != prevValue + 1) {
                return false;
            }
            prevValue = card.getIntValue();
        }
        return true;
    }

    public boolean isOnlyFlush() {
        return !isStraight() && isFlush();
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

    public boolean isFullHouse() {
        boolean isThereTriple = false;
        boolean isPair = false;
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.THREE) {
                isThereTriple = true;
            }
            if (group.getQuantity() == Values.TWO) {
                isPair = true;
            }
        }
        return isThereTriple && isPair;
    }

    public boolean isFourOfAKind() {
        for (Group group : this.groups) {
            if (group.getQuantity() == Values.FOUR) {
                return true;
            }
        }
        return false;
    }

    public boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    public int calculateTheHighestCard() {
        int high = this.cards[0].getIntValue();
        for (Card card : this.cards) {
            high = card.getIntValue() > high ? card.getIntValue() : high;
        }
        return high;
    }
}
