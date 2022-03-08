package org.fundacionjala.at15.katas.pokerhands.mauricio;

public class Main {
    public static void main(String[] args) {

        //PokerDeck black = {new ClubCard("1") , new ClubCard("2")};
        PokerDeck black = new PokerDeck(new ClubCard("A"), new ClubCard("Q"), new ClubCard("J"), new ClubCard("4"), new ClubCard("5"));
        System.out.println("Black Poker Deck");
        black.printDeck();


    }
}
