package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class Game {
    private String[] blackHand = {"2H", "3D", "5S", "9C", "KD"};
    private String[] whiteHand = {"2H", "3D", "5S", "9C", "KD"};
    private ArrayList<Integer> numeros;
    private ArrayList<String> suits;

    public void blackHand() {
        Hands hands = new Hands();
        hands.countCards(blackHand);
        PokerRules pokerRulesBlack = new PokerRules(numeros, suits);
        pokerRulesBlack.evaluateHand();
        pokerRulesBlack.getRange();
    }

    public void whiteHand() {
        Hands hands = new Hands();
        hands.countCards(whiteHand);
        PokerRules pokerRulesWhite = new PokerRules(numeros, suits);
        pokerRulesWhite.evaluateHand();
        pokerRulesWhite.getRange();
    }

    public void compareHands() {
        // compare range

    }
}
