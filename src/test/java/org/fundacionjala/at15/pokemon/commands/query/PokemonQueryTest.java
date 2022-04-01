package org.fundacionjala.at15.pokemon.commands.query;

import org.fundacionjala.at15.pokemon.io.Reader;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.Query;
import org.junit.Test;

import picocli.CommandLine;

public class PokemonQueryTest {
    @Test
    public void PokemonQuerySubcommandShouldShowTheFilesInformation() {
        PokemonQuery params = new PokemonQuery();
        new CommandLine(params).parseArgs("-name", "mewto");
        params.call();
        ArrayList<String> list = Query.getMatches(EntityType.POKEMON, "mewto");
        for (String item : list) {
            Reader.readJson(item);
        }
        Integer expected = 0;
        assertEquals(expected, params.call());
    }
}
