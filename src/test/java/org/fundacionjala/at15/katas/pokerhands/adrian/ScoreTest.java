package org.fundacionjala.at15.katas.pokerhands.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScoreTest {
    @Test
    public void compareScoreTest() {
        //tie
        Score score = new Score("2D 3H 5C 9S KH", "2D 3H 5C 9S KH");
        assertEquals(0, score.getScore1());
        assertEquals(0, score.getScore2());

        //pair
        Score score1 = new Score("AH 4S 4C 3D 7H", "2S 8C 7S 7H 6S");
        assertEquals(1, score1.getScore1());
        assertEquals(2, score1.getScore2());
        Score score1c = new Score("AH 8S 8C 3D 7H", "2S 8C 7S 7H 6S");
        assertEquals(3, score1c.getScore1());
        assertEquals(0, score1c.getScore2());
        Score score1a = new Score("2H 4S 4C 5D 3H", "2S 8S AH QS 3S");
        assertEquals(2, score1a.getScore1());
        assertEquals(1, score1a.getScore2());
        Score score1b = new Score("2H 4S KC 5D 3H", "2S 8S AH 8S 3S");
        assertEquals(0, score1b.getScore1());
        assertEquals(3, score1b.getScore2());

        //twopair
        Score score3 = new Score("9H TD TS 9C AD", "8H TD TS 8C 9D");
        assertEquals(4, score3.getScore1());
        assertEquals(0, score3.getScore2());
        Score score3a = new Score("8H TD 4S 8C 4D","9H JD JS 9C AD");
        assertEquals(0, score3a.getScore1());
        assertEquals(6, score3a.getScore2());
        Score score3b = new Score("8H AD 4S 7C 6D","9H KD KS 9C 2D");
        assertEquals(1, score3b.getScore1());
        assertEquals(5, score3b.getScore2());
        Score score3c = new Score("8H 4D 4S 8C 6D","4H 5D 6S 7C 8D");
        assertEquals(3, score3c.getScore1());
        assertEquals(5, score3c.getScore2());


        //threeOfAKind
        Score score5 = new Score("7C 7H 7S KC 2H", "6H 6D 6S KC 9D");
        assertEquals(6, score5.getScore1());
        assertEquals(1, score5.getScore2());
        Score score5a = new Score("7C 5H 2S 2C 2H", "JH JD JS 3C 9D");
        assertEquals(0, score5a.getScore1());
        assertEquals(7, score5a.getScore2());
        Score score5b = new Score("7C 7H 7S KC 2H", "6H 5D AS KC 9D");
        assertEquals(6, score5b.getScore1());
        assertEquals(1, score5b.getScore2());
        Score score5c = new Score("7C 6H KS KC 2H", "8H 8D 4S 8C 9D");
        assertEquals(3, score5c.getScore1());
        assertEquals(4, score5c.getScore2());

        //straight
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

        //flush
        Score score8 = new Score("2H 7H 3H 5H 8H", "2H KD AS 7C 2D");
        assertEquals(10, score8.getScore1());
        assertEquals(3, score8.getScore2());
        Score score8a = new Score("2D 3H 5C 9S KH", "2S 8S AS 8S 3S");
        assertEquals(0, score8a.getScore1());
        assertEquals(13, score8a.getScore2());
        Score score8b = new Score("2H 7H 3H 5H 8H", "4S KS 8S 7S 2S");
        assertEquals(0, score8b.getScore1());
        assertEquals(11, score8b.getScore2());
        Score score8c = new Score("4C 8C 9C TC JC", "3H 7H 4H 5H 8H");
        assertEquals(11, score8c.getScore1());
        assertEquals(0, score8c.getScore2());

        //FullHouse
        Score score9 = new Score("2H 4S 4C 2D 4H", "2H KD AS 7C 2D");
        assertEquals(29, score9.getScore1());
        assertEquals(1, score9.getScore2());
        Score score9a = new Score("2D 3H 9C 9S 9H", "4H 4S 7C 7D 7H");
        assertEquals(7, score9a.getScore1());
        assertEquals(23, score9a.getScore2());
        Score score9b = new Score("7S 7C AD AH 7H", "8H 6S 6C 8D 8H");
        assertEquals(6, score9b.getScore1());
        assertEquals(24, score9b.getScore2());
        Score score9c = new Score("4C 4C 4H TC TC", "2H 4S 4C 2D 4H");
        assertEquals(26, score9c.getScore1());
        assertEquals(0, score9c.getScore2());

    }
}
