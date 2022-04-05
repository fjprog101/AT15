package org.fundacionjala.at15.pokemon.commands.query;

import org.fundacionjala.at15.pokemon.io.Reader;
import static org.junit.Assert.assertEquals;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.junit.Test;
import picocli.CommandLine;

public class PokemonQueryTest {
    @Test
    public void PokemonQuerySubcommandShouldShowTheFilesInformation() {
        PokemonQuery params = new PokemonQuery();
        new CommandLine(params).parseArgs("-name", "pikachu");
        params.call();
        Pokemon pokemon = (Pokemon) Reader.read(params.getList().get(0));
        String expected = pokemon.getPokemonName();
        assertEquals("pikachu", expected);
    }
}