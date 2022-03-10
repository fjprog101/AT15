package org.fundacionjala.at15.katas.pokerhands.adrian;

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

    public String compareHands(String hand1, String hand2) {
        int score1 = 0;
        int score2 = 0;
        HighCard checkHighCard = new HighCard();
        String winner = checkHighCard.compareHandsWithHigherCard(hand1, hand2);
        if (winner.equals(hand1)) {
            score1 = score1 + 1;
        }
        if (winner.equals(hand2)) {
            score2 = score2 + 1;
        }

        if (score1 == score2) {
            return "It is a tie";
        } else if (score1 > score2) {
            winner = hand1;
        } else {
            winner = hand2;
        }
        return winner;
    }

    public int higherValue(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
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
