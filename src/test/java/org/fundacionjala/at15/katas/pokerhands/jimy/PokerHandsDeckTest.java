package org.fundacionjala.at15.katas.pokerhands.jimy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PokerHandsDeckTest{
    @Test
    public void isPair(){
        String content = "Black: 2H 5D 6S 6C 3D White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(1,poker.getPlayerOne().getCombination());
        assertEquals(6,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHadTwoPairs() {
        String content = "Black: 2H 2D 6S KC KD White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(2,poker.getPlayerOne().getCombination());
        assertEquals(13,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHadThreeOfAKind() {
        String content = "Black: 2H 5D KS KC KD White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(3,poker.getPlayerOne().getCombination());
        assertEquals(13,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHadStraight() {
        String content = "Black: 2H 3D 6S 4C 5D White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(4,poker.getPlayerOne().getCombination());
        assertEquals(6,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHasFlush() {
        String content = "Black: 2H 9H 6H 4H 5H White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(5,poker.getPlayerOne().getCombination());
        assertEquals(9,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHasFullHouse() {
        String content = "Black: 3D 3H AC AS AD White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(6,poker.getPlayerOne().getCombination());
        assertEquals(14,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHasfourOfAKind() {
        String content = "Black: TS AD AC AS AH White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(7,poker.getPlayerOne().getCombination());
        assertEquals(14,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHasStraighFlush() {
        String content = "Black: TD AD AD AD AD White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals(7,poker.getPlayerOne().getCombination());
        assertEquals(14,poker.getPlayerOne().getHighCard());
    }
    @Test
    public void getWinner() {
        String content = "Black: TD AD AD AD AD White: 2C 3H 4S 8C AH";
        PokerHandsDeck poker = new PokerHandsDeck(content);
        poker.judgeHands();
        assertEquals("Black",poker.getWinner());
        assertEquals(14,poker.getPlayerOne().getHighCard());
    }
}