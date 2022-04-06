package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DamageReceivedTest {
    @Test
    public void itShouldBeHpAfterDamage() {
        int maxHitPoints = 1000;
        int attackDamage = 100;
        double afterHp = 900;
        Pokemon pokemon = new Pokemon(maxHitPoints, "pokemon");
        DamageReceived damage = new DamageReceived(attackDamage);
        damage.affectHP(pokemon, "Fire");
        assertEquals(afterHp, pokemon.getHitPoints().getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldBeHpZero() {
        int currentHitPoints = 80;
        int attackDamage = 100;
        int afterHp = 0;
        Pokemon pokemon = new Pokemon(currentHitPoints, "pokemon");
        DamageReceived damage = new DamageReceived(attackDamage);
        damage.affectHP(pokemon, "Fire");
        assertEquals(afterHp, pokemon.getHitPoints().getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldAffectThePokemonFireTypeInTheDamage() {
        Pokemon pokemon1 = new Pokemon(200, "pokemon");
        pokemon1.setPokemonType("Fire");
        Pokemon pokemon2 = new Pokemon(200, "pokemon");
        pokemon2.setPokemonType("Water");
        DamageReceived damage = new DamageReceived(pokemon1.getMove(0).getPotency());
        damage.affectHP(pokemon2, pokemon1.getPokemonType());
        double expected = 168;
        assertEquals(expected, pokemon2.getHitPoints().getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldAffectThePokemonWaterTypeInTheDamage() {
        Pokemon pokemon1 = new Pokemon(200, "pokemon");
        pokemon1.setPokemonType("Water");
        Pokemon pokemon2 = new Pokemon(200, "pokemon");
        pokemon2.setPokemonType("Grass");
        DamageReceived damage = new DamageReceived(pokemon1.getMove(0).getPotency());
        damage.affectHP(pokemon2, pokemon1.getPokemonType());
        double expected = 168;
        assertEquals(expected, pokemon2.getHitPoints().getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldAffectThePokemonGrassTypeInTheDamage() {
        Pokemon pokemon1 = new Pokemon(200, "pokemon");
        pokemon1.setPokemonType("Grass");
        Pokemon pokemon2 = new Pokemon(200, "pokemon");
        pokemon2.setPokemonType("Fire");
        DamageReceived damage = new DamageReceived(pokemon1.getMove(0).getPotency());
        damage.affectHP(pokemon2, pokemon1.getPokemonType());
        double expected = 168;
        assertEquals(expected, pokemon2.getHitPoints().getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldAffectThePokemonFireGrassTypeInTheDamage() {
        Pokemon pokemon1 = new Pokemon(200, "pokemon");
        pokemon1.setPokemonType("Fire");
        Pokemon pokemon2 = new Pokemon(200, "pokemon");
        pokemon2.setPokemonType("Grass");
        DamageReceived damage = new DamageReceived(pokemon1.getMove(0).getPotency());
        damage.affectHP(pokemon2, pokemon1.getPokemonType());
        double expected = 152;
        assertEquals(expected, pokemon2.getHitPoints().getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldAffectThePokemonGrassWaterTypeInTheDamage() {
        Pokemon pokemon1 = new Pokemon(200, "pokemon");
        pokemon1.setPokemonType("Grass");
        Pokemon pokemon2 = new Pokemon(200, "pokemon");
        pokemon2.setPokemonType("Water");
        DamageReceived damage = new DamageReceived(pokemon1.getMove(0).getPotency());
        damage.affectHP(pokemon2, pokemon1.getPokemonType());
        double expected = 152;
        assertEquals(expected, pokemon2.getHitPoints().getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldAffectThePokemonWaterFireTypeInTheDamage() {
        Pokemon pokemon1 = new Pokemon(200, "pokemon");
        pokemon1.setPokemonType("Water");
        Pokemon pokemon2 = new Pokemon(200, "pokemon");
        pokemon2.setPokemonType("Fire");
        DamageReceived damage = new DamageReceived(pokemon1.getMove(0).getPotency());
        damage.affectHP(pokemon2, pokemon1.getPokemonType());
        double expected = 152;
        assertEquals(expected, pokemon2.getHitPoints().getCurrentHitPoints(), 0);
    }
}