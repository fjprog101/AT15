package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScoreTest {
    @Test
    public void compareHandsTest() {
        //tie
        Score score = new Score("2D 3H 5C 9S KH", "2D 3H 5C 9S KH");
        assertEquals(0, score.getScore1());
        assertEquals(0, score.getScore2());

        //pair
        Score score2 = new Score("AH 4S 4C 3D 7H", "2S 8C 7S 7H 6S");
        assertEquals(1, score2.getScore1());
        assertEquals(2, score2.getScore2());
        Score score1 = new Score("2H 4S 4C 2D 3H", "2S 8S AS QS 3S");
        assertEquals(2, score1.getScore1());
        assertEquals(1, score1.getScore2());

        //twopair
        Score score3 = new Score("9H TD TS 9C AD", "8H TD TS 8C 9D");
        assertEquals(4, score3.getScore1());
        assertEquals(0, score3.getScore2());
        Score score4 = new Score("9H JD JS 9C AD", "KH 7D 7S KC 9D");
        assertEquals(1, score4.getScore1());
        assertEquals(5, score4.getScore2());

        //threeOfAKind
        Score score5 = new Score("7C 7H 7S KC 2H", "6H 6D 6S KC 9D");
        assertEquals(6, score5.getScore1());
        assertEquals(1, score5.getScore2());
        Score score6 = new Score("7C 5H 2S 2C 2H", "JH JD JS 3C 9D");
        assertEquals(0, score6.getScore1());
        assertEquals(7, score6.getScore2());

        //straight
        //threeOfAKind
        Score score7 = new Score("4H 5D 6S 7C 8D", "KH 5D 6S 7C 8D");
        assertEquals(5, score7.getScore1());
        assertEquals(1, score7.getScore2());
        Score score7a = new Score("3H 4D 5S 6C QD", "3H 4D 5S 6C 7D");
        assertEquals(1, score7a.getScore1());
        assertEquals(5, score7a.getScore2());
        Score score7b = new Score("3H 4D 5S 6C 7D", "4H 5D 6S 7C 8D");
        assertEquals(0, score7b.getScore1());
        assertEquals(6, score7b.getScore2());
        Score score7c = new Score("7H 8D 9S TC JD", "4H 6D 5S 7C 8D");
        assertEquals(6, score7c.getScore1());
        assertEquals(0, score7c.getScore2());

    }
}
