package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class Main {
    public static void main(String[] args) {

        PokerDeck black = new PokerDeck(new HeartCard("2"), new DiamondCard("3"), new SpadeCard("5"), new ClubCard("9"),
                new DiamondCard("K"));
        System.out.println("Black Poker Deck:");
        black.printDeck();

        PokerDeck white = new PokerDeck(new ClubCard("2"), new HeartCard("3"), new SpadeCard("4"), new ClubCard("8"),
                new HeartCard("A"));
        System.out.println("White Poker Deck:");
        white.printDeck();

    }
}
