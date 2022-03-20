package org.fundacionjala.at15.katas.pokemon;

import org.fundacionjala.at15.pokemon.Wallet;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WalletTest {
    Wallet wallet = new Wallet();

    @Test
    public void itshouldAddBonus() {
        assertEquals(150, wallet.winBattle());
    }

    @Test
    public void itshouldTakeOffBonus() {
        assertEquals(50, wallet.loseBattle());
    }

    @Test
    public void itshouldReturnMoneyInWallet() {
        assertEquals(100, wallet.getMoneyInWallet());
    }

}
