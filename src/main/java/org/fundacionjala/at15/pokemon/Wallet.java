package org.fundacionjala.at15.pokemon;

public class Wallet {

    private int moneyInWallet;
    private final int moneyAtTheBeginning = 100;
    static final int BONUS = 50;

    public Wallet() {
        this.moneyInWallet = moneyAtTheBeginning;
    }

    public int winBattle() {
        return moneyInWallet + BONUS;
    }

    public int loseBattle() {
        if (moneyInWallet >= BONUS) {
            moneyInWallet = moneyInWallet - BONUS;
        }
        return moneyInWallet;
    }

    public int getMoneyInWallet() {
        return moneyInWallet;
    }

}
