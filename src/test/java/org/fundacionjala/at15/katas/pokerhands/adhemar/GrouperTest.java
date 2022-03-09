package org.fundacionjala.at15.katas.pokerhands.adhemar;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class GrouperTest {
    @Test
    public void itShouldGetGroup() {
        String[] group = {"3", "A", "5"};
        Card[] cards1 = {
            new Card('3', 'S'),
            new Card('A', 'D'),
            new Card('5', 'D'),
            new Card('3', 'H'),
            new Card('3', 'D')
        };
        Grouper grouper = new Grouper(cards1);

        assertArrayEquals(group, grouper.getGroup().toArray());
    }
}
