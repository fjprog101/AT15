package org.fundacionjala.at15.katas.pokerhands.gonzalo;

public class Main {
    private static DealCards deal = new DealCards();
    private static ValueHand value = new ValueHand();
    public static void main(String[] args) {
        loadHands();
    }

    public static void loadHands() {
        String[] blackHand = deal.handDeal();
        String[] whiteHand = deal.handDeal();
        if (value.getValueHand(blackHand) > value.getValueHand(whiteHand)) {
            System.out.println("Black win!");
        } else if (value.getValueHand(blackHand) < value.getValueHand(whiteHand)) {
            System.out.println("White win!");
        } else {
            System.out.println("equal");
        }
    }
}