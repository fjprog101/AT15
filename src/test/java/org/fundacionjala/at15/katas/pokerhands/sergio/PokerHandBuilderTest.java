package org.fundacionjala.at15.katas.pokerhands.sergio;

import org.junit.Test;
import static org.junit.Assert.*;

public class PokerHandBuilderTest {
    @Test
    public void itShouldHaveCardList() {
        Card card1 = new Card("3", "C");
        Card card2 = new Card("4", "H");
        Card card3 = new Card("5", "S");
        Card card4 = new Card("6", "D");
        Card card5 = new Card("J", "D");
        PokerHandBuilder cardList = new PokerHandBuilder(card1, card2, card3, card4, card5);

        assertEquals(card1, cardList.getHandOfCardsElement(0));
    }

}
