package org.fundacionjala.at15.pokemon;

public class Wallet {

    private int moneyInWallet;
    private final int moneyAtTheBeginning = 100;
    // private int money;

    public Wallet() {
        this.moneyInWallet = moneyAtTheBeginning;
    }

    public void winMoney(int money) {
        moneyInWallet = moneyInWallet + money;
    }

    public void spendMoney(int money) {
        if (moneyInWallet >= money) {
            moneyInWallet = moneyInWallet - money;
        }
    }

    public int getMoneyInWallet() {
        return moneyInWallet;
    }

}
