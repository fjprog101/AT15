package org.fundacionjala.at15.pokemon.commands;
import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.create.PokemonCreateCLI;
import org.fundacionjala.at15.pokemon.io.Reader;
import picocli.CommandLine;

public class SubCommandLearnTest {
    //@Test
    public void commandShouldCreateAddMovementToJsonFile() {
        PokemonCreateCLI pokemon1 = new PokemonCreateCLI();
        new CommandLine(pokemon1).parseArgs("-n", "pikachu", "-hp", "200");
        pokemon1.call();

        SubCommandLearn subCommandLearn = new SubCommandLearn();
        new CommandLine(subCommandLearn).parseArgs("-ID", pokemon1.getIdPokemonCreated());
        subCommandLearn.call();

        Reader.readJson(subCommandLearn.getIdPOkemon());
        String expected = "id: " + subCommandLearn.getIdPOkemon() + " name: pikachu hitpoints: 200/200";
        assertEquals(expected, Reader.getResult());
    }
}
