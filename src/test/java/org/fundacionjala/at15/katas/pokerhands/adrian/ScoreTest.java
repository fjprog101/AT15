package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScoreTest {
    @Test
    public void compareHandsTest() {
        //tie
        Score score1 = new Score("2D 3H 5C 9S KH", "2D 3H 5C 9S KH");
        assertEquals(0, score1.getScore1());
        assertEquals(0, score1.getScore2());

        //pair
        Score score2 = new Score("AH 4S 4C 3D 7H", "2S 8C 7S 7H 6S");
        assertEquals(1, score2.getScore1());
        assertEquals(2, score2.getScore2());

        //pair
        Score score3 = new Score("9H TD TS 9C AD", "8H TD TS 8C 9D");
        assertEquals(4, score3.getScore1());
        assertEquals(0, score3.getScore2());
        Score score4 = new Score("9H JD JS 9C AD", "KH 7D 7S KC 9D");
        assertEquals(1, score4.getScore1());
        assertEquals(5, score4.getScore2());

    }
}
