package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class PointsAssignerTest {
    @Test
    public void itShouldAssignPointsSimpleHand() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("J", "H");
        Card card3 = new Card("4", "S");
        Card card4 = new Card("7", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(20, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsOnlyPair() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("4", "S");
        Card card4 = new Card("7", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(30, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsDoublePair() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("4", "S");
        Card card4 = new Card("4", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(40, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsThreesome() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "H");
        Card card3 = new Card("2", "S");
        Card card4 = new Card("4", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(50, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsStraight() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "H");
        Card card3 = new Card("5", "S");
        Card card4 = new Card("4", "C");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(60, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsFlush() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("J", "D");
        Card card4 = new Card("A", "D");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(70, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsFullHouse() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "S");
        Card card3 = new Card("2", "C");
        Card card4 = new Card("A", "H");
        Card card5 = new Card("A", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(80, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsPoker() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("2", "S");
        Card card3 = new Card("2", "C");
        Card card4 = new Card("2", "H");
        Card card5 = new Card("A", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(90, pointsAssignerTest.getHandPoints());
    }

    @Test
    public void itShouldAssignPointsStraightFlush() {
        Card card1 = new Card("2", "D");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("4", "D");
        Card card4 = new Card("5", "D");
        Card card5 = new Card("6", "D");
        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        PointsAssigner pointsAssignerTest = new PointsAssigner(cardList);

        assertEquals(100, pointsAssignerTest.getHandPoints());
    }
}
