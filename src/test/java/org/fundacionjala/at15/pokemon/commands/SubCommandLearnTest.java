package org.fundacionjala.at15.pokemon.commands;
import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.behavior.Learn;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.io.Reader;
import picocli.CommandLine;

public class SubCommandLearnTest {
    //@Test
    public void commandShouldCreateAddMovementToJsonFile() {
        CreatePokemon pokemon1 = new CreatePokemon();
        new CommandLine(pokemon1).parseArgs("-n", "pikachu", "-hp", "200");
        pokemon1.call();

        Learn subCommandLearn = new Learn();
        new CommandLine(subCommandLearn).parseArgs("-ID", pokemon1.getIdPokemonCreated());
        subCommandLearn.call();

        Reader.readJson(subCommandLearn.getIdPOkemon());
        String expected = "id: " + subCommandLearn.getIdPOkemon() + " name: pikachu hitpoints: 200/200";
        assertEquals(expected, Reader.getResult());
    }
}
