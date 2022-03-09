package org.fundacionjala.at15.katas.pokerhands;

public class Main {
    public static void main(String[] args) {
        String[] black = {"2H", "3D", "5S", "9C", "KD" };
        Splitter splitterTest = new Splitter(black);
        splitterTest.theSplit();
    }

}
