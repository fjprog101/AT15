package org.fundacionjala.at15.katas.pokemon;

import org.fundacionjala.at15.pokemon.Wallet;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WalletTest {
    private final int money = 50;
    Wallet wallet = new Wallet();

    @Test
    public void itshouldAddBonus() {
        wallet.winMoney(money);
        assertEquals(150, wallet.getMoneyInWallet());
    }

    @Test
    public void itshouldTakeOffBonus() {
        wallet.spendMoney(money);
        assertEquals(50, wallet.getMoneyInWallet());
    }

    @Test
    public void itshouldReturnMoneyInWallet() {
        assertEquals(100, wallet.getMoneyInWallet());
    }

}
