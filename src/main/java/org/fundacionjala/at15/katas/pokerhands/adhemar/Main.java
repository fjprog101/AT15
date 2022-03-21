package org.fundacionjala.at15.katas.pokerhands.adhemar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int maxPlayers = 2;
        Player[] players = new Player[maxPlayers];
        System.out.println("WELCOME TO POKER HANDS");
        System.out.println("----------------------");
        System.out.println("Enter the data");
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < maxPlayers; index++) {
            System.out.println("User name " + (index + 1) + ":");
            String userName = scanner.nextLine();
            System.out.println("Cards:");
            String cards = scanner.nextLine();
            players[index] = new Player(userName, cards);
        }
        scanner.close();
        Game game = new Game(players);
        System.out.println("----------------------");
        System.out.println("Result:");
        System.out.println(game.getResult());
    }
}
