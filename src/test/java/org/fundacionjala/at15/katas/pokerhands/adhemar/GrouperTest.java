package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GrouperTest {
    @Test
    public void itShouldGetGroup() {
        Card[] cards1 = {
            new Card("3", "S"),
            new Card("A", "D"),
            new Card("5", "D"),
            new Card("3", "H"),
            new Card("3", "D")
        };
        Grouper grouper = new Grouper(cards1);

        assertEquals("3", grouper.getGroups().get(0).getStringValue());
        assertEquals("A", grouper.getGroups().get(1).getStringValue());
        assertEquals("5", grouper.getGroups().get(2).getStringValue());
    }
}
