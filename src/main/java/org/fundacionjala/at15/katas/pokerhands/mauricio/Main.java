package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class Main {
    public static void main(String[] args) {

        PokerHand black = new PokerHand(new Card("2", "H"), new Card("2", "D"), new Card("2", "S"),
                new Card("2", "C"),
                new Card("K", "D"));
        PokerHand white = new PokerHand(new Card("2", "C"), new Card("2", "H"), new Card("4", "S"),
                new Card("8", "C"),
                new Card("A", "H"));
        Game game = new Game(black, white);
        int result = black.getPairCardsScore();
        System.out.println("The score is: " + result);
        int result2 = white.getPairCardsScore();
        System.out.println("The score is: " + result2);

    }
}
