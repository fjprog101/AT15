package org.fundacionjala.at15.katas.pokerhands;

public class HighCard extends Hand {
    private final int three = 3;

    public String compareHands(String hand1, String hand2) {
        if (higherCard(hand1) > higherCard(hand2)) {
            return hand1;
        } else {
            return hand2;
        }
    }

    public int higherCard(String hand) {
        int number1 = 0;
        int number2 = 0;
        int higherValue = 0;
        int index = 0;
        while ((index + three) < hand.length()) {
            if (isNumeric(String.valueOf(hand.charAt(index)))) {
                number1 = Character.getNumericValue(hand.charAt(index));
            } else {
                number1 = valueOfCard(hand.charAt(index));
            }

            if (isNumeric(String.valueOf(hand.charAt(index + three)))) {
                number2 = Character.getNumericValue(hand.charAt(index + three));
            } else {
                number2 = valueOfCard(hand.charAt(index + three));
            }

            if (higherValue(number1, number2) > higherValue) {
                higherValue = higherValue(number1, number2);
            }
            index = index + three;
        }
        return higherValue;
    }
}
