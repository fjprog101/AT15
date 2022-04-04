package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertNotSame;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;
import org.junit.Test;

public class IdentifierTest {
    @Test
    public void itShouldBeDifferentIdForTheDifferentPokemon() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(1000, "Pikachu");
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        assertNotSame(Identifier.generateId(pokemon), Identifier.generateId(pokemon1));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentTrainer() throws IncompleteArguments {
        Pokemon pokemon = new Pokemon(1000, "Pikachu");
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        Trainer trainer = new Trainer(pokemon, "Ash");
        Trainer trainer1 = new Trainer(pokemon1, "Ash");
        assertNotSame(Identifier.generateId(trainer), Identifier.generateId(trainer1));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentBattle() throws IncompleteArguments {
        Pokemon pokemon1 = new Pokemon(1000, "Pikachu");
        Pokemon pokemon2 = new Pokemon(1000, "Snorlax");
        Trainer trainer1 = new Trainer(pokemon1, "Ash");
        Trainer trainer2 = new Trainer(pokemon2, "Diana");
        Battle battle1 = new TrainerBattle(trainer1, trainer2);
        Pokemon pokemon3 = new Pokemon(1000, "Pikachu");
        Pokemon pokemon4 = new Pokemon(1000, "Snorlax");
        Trainer trainer3 = new Trainer(pokemon3, "Ash");
        Trainer trainer4 = new Trainer(pokemon4, "Diana");
        Battle battle2 = new TrainerBattle(trainer3, trainer4);

        assertNotSame(Identifier.generateId(battle1), Identifier.generateId(battle2));
    }

    @Test
    public void itShouldBeDifferentIdForTheDifferentTown() throws IncompleteArguments {
        Town town1 = new Town();
        Town town2 = new Town();

        assertNotSame(Identifier.generateId(town1), Identifier.generateId(town2));
    }
}