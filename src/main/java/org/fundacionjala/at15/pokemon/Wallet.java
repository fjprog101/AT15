package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Wallet.*;

public class Wallet {

    private int moneyInWallet;

    public Wallet() {
        this.moneyInWallet = INITIAL_MONEY;
    }

    public void winMoney(int money) {
        moneyInWallet = moneyInWallet + money;
    }

    public void spendMoney(int money) {
        if (moneyInWallet >= money) {
            moneyInWallet = moneyInWallet - money;
        }
    }

    public void loseMoney(int money) {
        if (moneyInWallet <= money) {
            moneyInWallet = 0;
        } else {
            moneyInWallet = moneyInWallet - money;
        }
    }

    public int getMoneyInWallet() {
        return moneyInWallet;
    }

}
