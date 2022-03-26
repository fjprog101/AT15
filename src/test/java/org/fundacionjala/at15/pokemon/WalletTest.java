package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WalletTest {
    private final int money = 50;
    Wallet wallet = new Wallet();

    @Test
    public void itShouldAddBonus() {
        wallet.winMoney(money);
        assertEquals(150, wallet.getMoneyInWallet());
    }

    @Test
    public void itShouldTakeOffBonus() {
        wallet.spendMoney(money);
        assertEquals(50, wallet.getMoneyInWallet());
    }

    @Test
    public void itShouldReturnMoneyInWallet() {
        assertEquals(100, wallet.getMoneyInWallet());
    }

    @Test
    public void itShouldLoseMoney() {
        wallet.loseMoney(50);
        assertEquals(50,wallet.getMoneyInWallet());
    }


    @Test
    public void itShouldSetMoneyTo0IfHasLessThanPay() {
        wallet.loseMoney(200);
        assertEquals(0, wallet.getMoneyInWallet());
     }
}
