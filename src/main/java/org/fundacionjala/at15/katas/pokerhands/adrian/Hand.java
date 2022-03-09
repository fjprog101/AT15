package org.fundacionjala.at15.katas.pokerhands.adrian;

public abstract class Hand {
    private final int ten = 10;
    private final int eleven = 11;
    private final int twelve = 12;
    private final int thirteen = 13;
    private final int fourteen = 14;

    public abstract String compareHands(String hand1, String hand2);

    public int higherValue(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    }

    public boolean isNumeric(String str) {
        return str != null && str.matches("[2-9]+");
    }

    public int valueOfCard(Character character) {
        int result = 0;
        if (character.equals('T')) {
            result = ten;
        }
        if (character.equals('J')) {
            result = eleven;
        }
        if (character.equals('Q')) {
            result = twelve;
        }
        if (character.equals('K')) {
            result = thirteen;
        }
        if (character.equals('A')) {
            result = fourteen;
        }
        return result;
    }
}
