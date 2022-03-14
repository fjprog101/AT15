package org.fundacionjala.at15.katas.pokerhands.jimy;


public class PokerHandsDeck {
    private PokerHand playerOne;
    private PokerHand playerTwo;
    private final int numCards = 5;
    private final int highCard = 4;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int fourteen = 14;
    public PokerHandsDeck(String line) {
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
    public boolean hasPair(PokerHand player) {
        for (int index = 0; index < numCards - 1; index++) {
            if (isPair(player.getCard(index), player.getCard(index + 1))) {
                return true;
            }
        }
        return false;
    }
    private boolean hasTwoPair(PokerHand player) {
        for (int index = 0; index < numCards - three; index++) {
            if (isPair(player.getCard(index), player.getCard(index + 1))) {
                for (int jIndex = index + 2; jIndex < numCards - 1; jIndex++) {
                    if (isPair(player.getCard(jIndex), player.getCard(jIndex + 1))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean hasThreeOfAKind(PokerHand player) {
        for (int index = 0; index < numCards - 2; index++) {
            if (isThreeOfAKind(player.getCard(index), player.getCard(index + 1), player.getCard(index + 2))) {
                return true;
            }
        }
        return false;
    }
    public boolean isThreeOfAKind(Card card1, Card card2, Card card3) {
        return card1.getValue() == card2.getValue() && card2.getValue() == card3.getValue();
    }
    public boolean hasStraight(PokerHand player) {
        for (int index = numCards - 1; index > 0; index--) {
            int one = player.getValue(index);
            int two = player.getValue(index - 1);
            if (one == fourteen && two == five) {
                continue;
            }
            if (one - two != 1) {
                return false;
            }
        }
        return true;
    }
    public boolean hasFlush(PokerHand player) {
        for (int index = 0; index < numCards - 1; index++) {
            if (player.getSuit(index) != player.getSuit(index + 1)) {
                return false;
            }
        }
        return true;
    }
    public boolean hasFullHouse(PokerHand player) {
        return (isPair(player.getCard(0), player.getCard(1))
            && isThreeOfAKind(player.getCard(2), player.getCard(three), player.getCard(four))
            || isPair(player.getCard(three), player.getCard(four))
            && isThreeOfAKind(player.getCard(0), player.getCard(1), player.getCard(2)));
    }
    public boolean hasFourOfAKind(PokerHand player) {
        for (int index = 0; index < numCards - three; index++) {
            if (isThreeOfAKind(player.getCard(index), player.getCard(index + 1), player.getCard(index + 2))
                && isPair(player.getCard(index + 2), player.getCard(index + three))) {
                return true;
            }
        }
        return false;
    }
    public boolean hasStraightFlush(PokerHand player) {
        return hasFlush(player) && hasStraight(player);
    }
    public boolean isPair(Card card1, Card card2) {
        return card1.getValue() == card2.getValue();
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