package org.fundacionjala.at15.katas.pokemon;

import static org.junit.Assert.assertEquals;

import java.lang.annotation.Target;

import org.fundacionjala.at15.pokemon.gonzalo.DamageReceived;
import org.junit.Test;

public class DamageReceivedTest {
    @Test
    public void itShouldBeHpAfterDamage() {
        int hitPoints = 100;
        int hp = 1000;
        int afterHp = 900;
        DamageReceived damage = new DamageReceived(hitPoints, hp);
        assertEquals(afterHp, damage.getHp());
    }
}