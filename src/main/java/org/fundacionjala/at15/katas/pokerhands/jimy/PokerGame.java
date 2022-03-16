package org.fundacionjala.at15.katas.pokerhands.jimy;
public class PokerGame extends RankCard {
    private PokerHand playerOne;
    private PokerHand playerTwo;
    private final int numCards = 5;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int fourteen = 14;
    public PokerGame(String line) {
        String black = line.substring(line.indexOf(":") + 1, line.indexOf("White:"));
        String white = line.substring(line.lastIndexOf(":") + 1);
        String[] playerOneCards = black.trim().split(" ");
        String[] playerTwoCards = white.trim().split(" ");
        playerOne = new PokerHand(playerOneCards);
        playerTwo = new PokerHand(playerTwoCards);
    }
    public PokerHand getPlayerOne() {
        return playerOne;
    }
    public PokerHand getPlayerTwo() {
        return playerTwo;
    }
    public void setPlayerOne(PokerHand newplayerOne) {
        playerOne = newplayerOne;
    }
    public void judgeHands() {
        getCombination(playerOne);
        getCombination(playerTwo);
    }
    private void getCombination(PokerHand player) {
        if (hasStraightFlush(player)) {
            player.setCombination(eight);
            int aux = player.getValue(four) == fourteen && player.getValue(three) == five ? five : player.getValue(four);
            player.setHighCard(aux);
        } else if (hasFourOfAKind(player)) {
            player.setCombination(seven);
            player.setHighCard(player.getValue(2));
        } else if (hasFullHouse(player)) {
            player.setCombination(six);
            player.setHighCard(player.getValue(2));
        } else if (hasFlush(player)) {
            player.setCombination(five);
            player.setHighCard(player.getValue(four));
        } else if (hasStraight(player)) {
            player.setCombination(four);
            int aux = player.getValue(four) == fourteen && player.getValue(three) == five ? five : player.getValue(four);
            player.setHighCard(aux);
        } else if (hasThreeOfAKind(player)) {
            player.setCombination(three);
            player.setHighCard(player.getValue(three));
        } else if (hasTwoPair(player)) {
            player.setCombination(2);
            player.setHighCard(player.getValue(three));
        } else if (hasPair(player)) {
            player.setCombination(1);
            if (isPair(player.getCard(0), player.getCard(1)) || isPair(player.getCard(2), player.getCard(1))) {
                player.setHighCard(player.getValue(1));
            } else {
                player.setHighCard(player.getValue(three));
            }
        } else {
            player.setHighCard(player.getValue(four));
        }
    }
    public String getWinner() {
        if (playerOne.getCombination() == playerTwo.getCombination()) {
            if (playerOne.getHighCard() == playerTwo.getHighCard()) {
                return resolveTie();
            } else {
                return playerOne.getHighCard() > playerTwo.getHighCard() ? "Black" : "White";
            }
        } else {
            return playerOne.getCombination() > playerTwo.getCombination() ? "Black" : "White";
        }
    }
    private String resolveTie() {
        for (int index = numCards; index >= 0; index--) {
            if (playerOne.getValue(index) == playerTwo.getValue(index)) {
                continue;
            }
            return playerOne.getValue(index) > playerTwo.getValue(index) ? "Black" : "White";
        }
        return "Tie";
    }
}