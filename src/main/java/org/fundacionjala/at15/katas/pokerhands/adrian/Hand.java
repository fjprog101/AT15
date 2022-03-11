package org.fundacionjala.at15.katas.pokerhands.adrian;

import java.util.Arrays;

public class Hand {
    private static final int TWO_CARD = 2;
    private static final int THREE_CARD = 3;
    private static final int FOUR_CARD = 4;
    private static final int FIVE_CARD = 5;
    private static final int SIX_CARD = 6;
    private static final int SEVEN_CARD = 7;
    private static final int EIGHT_CARD = 8;
    private static final int NINE_CARD = 9;
    private static final int TEN_CARD = 10;
    private static final int J_CARD = 11;
    private static final int Q_CARD = 12;
    private static final int K_CARD = 13;
    private static final int A_CARD = 14;

    protected static final int INDEX_CERO = 0;
    protected static final int INDEX_THREE = 3;
    protected static final int INDEX_FOUR = 4;
    protected static final int INDEX_SIX = 6;
    protected static final int INDEX_SEVEN = 7;
    protected static final int INDEX_NINE = 9;
    protected static final int INDEX_TEN = 10;
    protected static final int INDEX_TWELVE = 12;
    protected static final int INDEX_THIRTEEN = 13;

    public String compareHands(String hand1, String hand2) {
        Score score = new Score(hand1, hand2);
        String absolutWinner = "";

        if (score.getScore1() == score.getScore2()) {
            return "It is a tie";
        } else if (score.getScore1() > score.getScore2()) {
            absolutWinner = hand1;
        } else {
            absolutWinner = hand2;
        }
        return absolutWinner;
    }

    public int[] sortedHand(String hand) {
        int number1 = valueOfCard(hand.charAt(INDEX_CERO));
        int number2 = valueOfCard(hand.charAt(INDEX_THREE));
        int number3 = valueOfCard(hand.charAt(INDEX_SIX));
        int number4 = valueOfCard(hand.charAt(INDEX_NINE));
        int number5 = valueOfCard(hand.charAt(INDEX_TWELVE));
        int[] array = {number1, number2, number3, number4, number5};
        Arrays.sort(array);
        return array;
    }

    public char[] handSuit(String hand) {
        char[] suits = {hand.charAt(1), hand.charAt(INDEX_FOUR), hand.charAt(INDEX_SEVEN),
                        hand.charAt(INDEX_TEN), hand.charAt(INDEX_THIRTEEN)};
        return suits;
    }

    public int valueOfCard(Character character) {
        int result = 0;
        switch (character) {
            case '2':
                result = TWO_CARD;
                break;
            case '3':
                result = THREE_CARD;
                break;
            case '4':
                result = FOUR_CARD;
                break;
            case '5':
                result = FIVE_CARD;
                break;
            case '6':
                result = SIX_CARD;
                break;
            case '7':
                result = SEVEN_CARD;
                break;
            case '8':
                result = EIGHT_CARD;
                break;
            case '9':
                result = NINE_CARD;
                break;
            case 'T':
                result = TEN_CARD;
                break;
            case 'J':
                result = J_CARD;
                break;
            case 'Q':
                result = Q_CARD;
                break;
            case 'K':
                result = K_CARD;
                break;
            case 'A':
                result = A_CARD;
                break;
            default:
                break;
        }
        return result;
    }
}
