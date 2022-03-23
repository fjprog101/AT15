package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DamageReceivedTest {
    @Test
    public void itShouldBeHpAfterDamage() {
        int maxHitPoints = 1000;
        int attackDamage = 100;
        int afterHp = 900;
        Pokemon pokemon = new Pokemon(maxHitPoints, "pokemon");
        DamageReceived damage = new DamageReceived(attackDamage);
        damage.affectHP(pokemon);
        assertEquals(afterHp, pokemon.getHitPoints().getCurrentHitPoints());
    }

    @Test
    public void itShouldBeHpZero() {
        int currentHitPoints = 80;
        int attackDamage = 100;
        int afterHp = 0;
        Pokemon pokemon = new Pokemon(currentHitPoints, "pokemon");
        DamageReceived damage = new DamageReceived(attackDamage);
        damage.affectHP(pokemon);
        assertEquals(afterHp, pokemon.getHitPoints().getCurrentHitPoints());
    }
}