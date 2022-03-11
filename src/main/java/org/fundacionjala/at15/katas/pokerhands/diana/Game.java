package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class Game {
    private String[] blackHand = {"2H", "3D", "5S", "9C", "KD"};
    private String[] whiteHand = {"2H", "3D", "5S", "9C", "KD"};
    private ArrayList<Integer> numeros;
    private ArrayList<String> suits;

    public void blackHand() {
        Card hands = new Card(blackHand);
        hands.countCards(blackHand);
        PokerRules pokerRulesBlack = new PokerRules(numeros, suits);
        pokerRulesBlack.evaluateHand(numeros, suits);
        pokerRulesBlack.getRange();
    }

    public void whiteHand() {
        Card hands = new Card(whiteHand);
        hands.countCards(whiteHand);
        PokerRules pokerRulesWhite = new PokerRules(numeros, suits);
        pokerRulesWhite.evaluateHand(numeros, suits);
        pokerRulesWhite.getRange();
    }

    public void compareHands() {
        // compare range

    }
}
