package org.fundacionjala.at15.pokemon;

public class Wallet {

    private int moneyInWallet;
    private final int moneyAtTheBeginning = 100;
    // private int money;

    public Wallet(int money) {
        this.moneyInWallet = moneyAtTheBeginning;
    }

    public int winMoney(int money) {
        return moneyInWallet + money;
    }

    public int spendMoney(int money) {
        if (moneyInWallet >= money) {
            moneyInWallet = moneyInWallet - money;
        }
        return moneyInWallet;
    }

    public int getMoneyInWallet() {
        return moneyInWallet;
    }

}
