package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DamageReceivedTest {
    @Test
    public void itShouldBeHpAfterDamage() {
        int maxHitPoints = 1000;
        int attackDamage = 100;
        int afterHp = 900;
        DamageReceived damage = new DamageReceived(maxHitPoints, attackDamage);
        assertEquals(afterHp, damage.getHp());
    }
}