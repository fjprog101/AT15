package org.fundacionjala.at15.katas.pokerhands.jimy;

public class PokerHandsDeck {
    private PokerHand playerOne;
    private PokerHand playerTwo;
    private final int numCards = 5;
    private final int cardHight = 3;
    public PokerHandsDeck(String inputFile) {
        String black = inputFile.substring(inputFile.indexOf(":") + 1, inputFile.indexOf("White:"));
        String white = inputFile.substring(inputFile.lastIndexOf(":") + 1);
        String[] playerOneCards = black.trim().split(" ");
        String[] playerTwoCards = white.trim().split(" ");
        setPlayerOne(new PokerHand(playerOneCards));
        playerTwo = new PokerHand(playerTwoCards);
    }
    public PokerHand getPlayerOne() {
        return playerOne;
    }
    public void setPlayerOne(PokerHand newplayerOne) {
        playerOne = newplayerOne;
    }
    public void judgeHands() {
        getCombination(getPlayerOne());
    }
    private void getCombination(PokerHand player) {
        if (hasPair(player)) {
            player.setCombination(1);
            if (isPair(player.getCard(0), player.getCard(1)) || isPair(player.getCard(2), player.getCard(1))) {
                player.setHighCard(player.getValue(1));
            } else {
                player.setHighCard(cardHight);
            }
        }
    }
    public boolean hasPair(PokerHand player) {
        for (int index = 0; index < numCards; index++) {
            if (isPair(player.getCard(index), player.getCard(index + 1))) {
                return true;
            }
        }
        return false;
    }
    public boolean isPair(Card card1, Card card2) {
        return card1.getValue() == card2.getValue();
    }
}