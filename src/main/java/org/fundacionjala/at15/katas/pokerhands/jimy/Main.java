package org.fundacionjala.at15.katas.pokerhands.jimy;

public class Main {
    public  static void main(String[] args) {
        String input = "Black: 2H 5D 6S 6C TD White: 2C 3H 4S 8C AH";
        PokerHandsDeck card = new PokerHandsDeck(input);
        card.judgeHands();
        System.out.println(card.getPlayerOne().getHighCard());
        /*for(int index = 0; index < 5; index++){
            System.out.println(card.getPlayerTwo().getValue(index));
        }*/
    }
}
