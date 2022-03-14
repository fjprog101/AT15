package org.fundacionjala.at15.katas.pokerhands.vladimir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandTest {

    @Test
    public void itShouldReturnaHand() {
        Card[] card = new Card[5];
        card[0] = new Card("2", "C");
        card[1] = new Card("3", "D");
        card[2] = new Card("4", "D");
        card[3] = new Card("J", "H");
        card[4] = new Card("A", "S");
        Hand hand = new Hand(card);
        Card expectedCard = new Card("2", "C");
        assertEquals(expectedCard.combination(), hand.getCards()[0].combination());
    }
}
