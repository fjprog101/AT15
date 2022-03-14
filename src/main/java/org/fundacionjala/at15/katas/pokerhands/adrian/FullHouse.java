package org.fundacionjala.at15.katas.pokerhands.adrian;

public class FullHouse extends HandHandler {
    private final int fullHousePoints = 20;
    private int score1;
    private int score2;
    public int[] fullHouse(String hand) {
        int[] result = new int[INDEX_THREE];
        int counter = 0;
        int indexTrhee = 0;
        for (int index = 0; index < INDEX_THREE; index++) {
            if (sortedHand(hand)[index] == sortedHand(hand)[index + 1]
                && sortedHand(hand)[index] == sortedHand(hand)[index + 2]) {
                indexTrhee = index;
                result[0] = sortedHand(hand)[index];
                counter++;
            }
        }
        int[] proxyArray = new int[2];
        for (int ind = 0, knd = 0; ind < sortedHand(hand).length; ind++) {
            if (ind != indexTrhee && ind != (indexTrhee + 1) && ind != (indexTrhee + 2)) {
                proxyArray[knd++] = sortedHand(hand)[ind];
            }
        }
        if (proxyArray[0] == proxyArray[1]) {
            result[1] = proxyArray[0];
            counter++;
        }
        if (result[1] != 0 && result[0] != result[1]) {
            counter++;
        }
        result[2] = counter;
        return result;
    }

    public boolean theHandIsFullHouse(String hand) {
        boolean result = false;
        if (fullHouse(hand)[2] == INDEX_THREE) {
            result = true;
        }
        return result;
    }

    public String compareHandsFullHouse(String hand1, String hand2) {
        String winner = "Tie";
        if (fullHouse(hand1)[0] == fullHouse(hand2)[0]) {
            if (fullHouse(hand1)[1] > fullHouse(hand2)[1]) {
                winner = hand1;
            }
            if (fullHouse(hand2)[1] > fullHouse(hand1)[1]) {
                winner = hand2;
            }
        }
        if (fullHouse(hand1)[0] > fullHouse(hand2)[0]) {
            winner = hand1;
        }
        if (fullHouse(hand2)[0] > fullHouse(hand1)[0]) {
            winner = hand2;
        }
        return winner;
    }

    public void compareFullHouse(String hand1, String hand2) {
        if (theHandIsFullHouse(hand1) && theHandIsFullHouse(hand2)) {
            String winner = compareHandsFullHouse(hand1, hand2);
            if (winner.equals(hand1)) {
                score1 = score1 + fullHousePoints;
            }
            if (winner.equals(hand2)) {
                score2 = score2 + fullHousePoints;
            }
        } else if (theHandIsFullHouse(hand1)) {
            score1 = score1 + fullHousePoints;
        } else if (theHandIsFullHouse(hand2)) {
            score2 = score2 + fullHousePoints;
        }
    }
    public int getScore1() {
        return this.score1;
    }
    public int getScore2() {
        return this.score2;
    }
}
