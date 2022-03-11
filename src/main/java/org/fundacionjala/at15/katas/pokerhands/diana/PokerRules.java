package org.fundacionjala.at15.katas.pokerhands.diana;

import java.util.ArrayList;

public class PokerRules {
    protected ArrayList<Integer> number;
    private ArrayList<String> suit;
    private int range;

    private HighCard highCard = new HighCard();
    private Pair pair = new Pair();
    private TwoPair twoPair = new TwoPair();
    private ThreeOfKind threeOfKind = new ThreeOfKind();
    private Straight straight = new Straight();
    private Flush flush = new Flush();
    private FullHouse fullHouse = new FullHouse();
    private FourOfKind fourOfKind = new FourOfKind();
    private StraightFlush straightFlush = new StraightFlush();

    public PokerRules(ArrayList<Integer> number, ArrayList<String> suit) {
        this.number = number;
        this.suit = suit;
        this.range = 0;
    }

    public void evaluateHand(ArrayList<Integer> numbers, ArrayList<String> suits) {
        highCard.analysisOfRule(numbers);
        pair.analysisOfRule(numbers);
        twoPair.analysisOfRule(numbers, suits);
        threeOfKind.analysisOfRule(numbers);
        straight.analysisOfRule(numbers, suits);
        flush.analysisOfRule(numbers, suits);
        fullHouse.analysisOfRule(numbers, suits);
        fourOfKind.analysisOfRule(numbers);
        straightFlush.analysisOfRule(numbers, suit);
    }

    public int getRange() {
        return range;
    }
}
