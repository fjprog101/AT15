package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Wallet.*;

import javax.xml.bind.annotation.*;

import org.fundacionjala.at15.pokemon.commands.exceptions.WalletException;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Wallet {
    private int moneyInWallet;

    public Wallet() {
        this.moneyInWallet = INITIAL_MONEY;
    }

    public void winMoney(int money) {
        moneyInWallet = moneyInWallet + money;
    }

    public void spendMoney(int money) throws WalletException {
        if (moneyInWallet < money) {
            throw new WalletException(
                    "Error. The trainer doesn't have enough money to buy this item",
                    null, true, false);
        }
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
