package org.fundacionjala.at15.katas.pokemon;

import org.fundacionjala.at15.pokemon.Wallet;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WalletTest {
    private final int money = 50;
    Wallet wallet = new Wallet(money);

    @Test
    public void itshouldAddBonus() {
        assertEquals(150, wallet.winMoney(money));
    }

    @Test
    public void itshouldTakeOffBonus() {
        assertEquals(50, wallet.spendMoney(money));
    }

    @Test
    public void itshouldReturnMoneyInWallet() {
        assertEquals(100, wallet.getMoneyInWallet());
    }

}
