package org.fundacionjala.at15.katas.pokerhands.jimy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PokerGameTest{
    private int pair = 1;
    private int twoPairs = 2;
    private int ThreeOfAKind = 3;
    private int straight = 4;
    private int flush = 5;
    private int fullHouse = 6;
    private int fourOfAKind = 7;
    private int straightFlush = 8;
    @Test
    public void shouldHaveAPair(){
        String content = "Black: 2H 5D 6S 6C 3D White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(pair, poker.getPlayerOne().getCombination());
        assertEquals(6, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHaveTwoPairs() {
        String content = "Black: 2H 2D 6S KC KD White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(twoPairs, poker.getPlayerOne().getCombination());
        assertEquals(13, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHaveThreeOfAKind() {
        String content = "Black: 2H 5D KS KC KD White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(ThreeOfAKind, poker.getPlayerOne().getCombination());
        assertEquals(13, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHaveStraight() {
        String content = "Black: 2H 3D 6S 4C 5D White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(straight, poker.getPlayerOne().getCombination());
        assertEquals(6, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHaveFlush() {
        String content = "Black: 2H 9H 6H 4H 5H White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(flush, poker.getPlayerOne().getCombination());
        assertEquals(9, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHaveFullHouse() {
        String content = "Black: 3D 3H AC AS AD White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(fullHouse, poker.getPlayerOne().getCombination());
        assertEquals(14, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHavefourOfAKind() {
        String content = "Black: TS AD AC AS AH White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(fourOfAKind, poker.getPlayerOne().getCombination());
        assertEquals(14, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldHaveStraighFlush() {
        String content = "Black: TD JD QD KD AD White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals(straightFlush, poker.getPlayerOne().getCombination());
        assertEquals(14, poker.getPlayerOne().getHighCard());
    }
    @Test
    public void shouldWinBlack() {
        String content = "Black: TD AD AD AD AD White: 2C 3H 4S 8C AH";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals("Black", poker.getWinner());
    }
    @Test
    public void shouldWinWhite() {
        String content = "Black: TC 9D 7H 3D 2D White: 2C 3H 4S 5C 6H";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals("White", poker.getWinner());
    }
    @Test
    public void ShouldGetTie() {
        String content = "Black: 2C 3D 4H 5D 6D White: 2S 3H 4S 5C 6H";
        PokerGame poker = new PokerGame(content);
        poker.judgeHands();
        assertEquals("Tie", poker.getWinner());
    }
}