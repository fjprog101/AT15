package org.fundacionjala.at15.katas.pokerhands.jimy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class PokerHandsDeckTest{
    @Test
        public void isPair() {
            String content = "Black: 2H 5D 6S 6C KD White: 2C 3H 4S 8C AH";
            PokerHandsDeck poker = new PokerHandsDeck(content);
            poker.judgeHands();
            assertEquals(1,poker.getPlayerOne().getCombination());
            assertEquals(13,poker.getPlayerOne().getHighCard());
        }
}