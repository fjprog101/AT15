package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class ValueHand {

    private RankedHand ranked;
    private int valueHand;
    //these variables were created to return the value of the hand since the check test did not allow me to assign
    //the value directly in the functions that obtain the value of the hand
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int nine = 9;

    public int getValueHand(String[] hand) {
        isMajorCard(hand);
        isPair(hand);
        isTwoPair(hand);
        isThree(hand);
        isStraight(hand);
        isFlush(hand);
        isFull(hand);
        isFour(hand);
        isStraightFlush(hand);
        return valueHand;
    }

    public void isMajorCard(String[] hand) {
        int value = 0;
        ranked = new ValueHandMajorCard();
        if (ranked.rankedHand(hand)) {
            value = one;
            setValue(value);
        }
    }

    public void isPair(String[] hand) {
        int value = 0;
        ranked = new ValueHandPair();
        if (ranked.rankedHand(hand)) {
            value = two;
            setValue(value);
        }
    }

    public void isTwoPair(String[] hand) {
        int value = 0;
        ranked = new ValueHandTwoPair();
        if (ranked.rankedHand(hand)) {
            value = three;
            setValue(value);
        }
    }

    public void isThree(String[] hand) {
        int value = 0;
        ranked = new ValueHandThreeOfAKind();
        if (ranked.rankedHand(hand)) {
            value = four;
            setValue(value);
        }
    }

    public void isStraight(String[] hand) {
        int value = 0;
        ranked = new ValueHandStraight();
        if (ranked.rankedHand(hand)) {
            value = five;
            setValue(value);
        }
    }

    public void isFlush(String[] hand) {
        int value = 0;
        ranked = new ValueHandFlush();
        if (ranked.rankedHand(hand)) {
            value = six;
            setValue(value);
        }
    }

    public void isFull(String[] hand) {
        int value = 0;
        ranked = new ValueHandFullHouse();
        if (ranked.rankedHand(hand)) {
            value = seven;
            setValue(value);
        }
    }

    public void isFour(String[] hand) {
        int value = 0;
        ranked = new ValueHandFourOfAKind();
        if (ranked.rankedHand(hand)) {
            value = eight;
            setValue(value);
        }
    }

    public void isStraightFlush(String[] hand) {
        int value = 0;
        ranked = new ValueHandStraightFlush();
        if (ranked.rankedHand(hand)) {
            value = nine;
            setValue(value);
        }
    }

    public void setValue(int value) {
        valueHand = value;
    }
}