package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrainerTest {
    @Test
    public void itShouldVerifyIfCanUsePokeball() {
        Trainer trainer = new Trainer();
        boolean actual = trainer.usePokeball();
        assertEquals(false, actual);
    }

    @Test
    public void itShouldVerifyIfCanUsePotion() {
        Trainer trainer = new Trainer();
        boolean actual = trainer.usePotion();
        assertEquals(false, actual);
    }
}
