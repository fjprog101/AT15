package org.fundacionjala.at15.pokemon.commands.behavior;

import com.google.gson.Gson;
import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.fundacionjala.at15.pokemon.io.Writer;
import org.junit.Assert;
import org.junit.Test;
import picocli.CommandLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseTest {

    @Test
    public void itShouldUseMovement() throws FileNotFoundException {
        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        CreatePokemon params1 = new CreatePokemon();
        new CommandLine(params1).parseArgs("-n", "pikachu", "-hp", "300");
        params1.call();
        current.setPokemon(params1.getIdPokemonCreated());
        CreatePokemon params = new CreatePokemon();
        new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
        params.call();
        current.setPokemonOpponent(params.getIdPokemonCreated());
        Writer.writeToJson(current);
        Use params2 = new Use();
        new CommandLine(params2).parseArgs("-move", "basicAttack");
        params2.call();
        Writer.writeToJson(current);
        Pokemon expectedPokemon = (Pokemon) Reader.readJson(current.getPokemonOpponent());


        Assert.assertEquals(60, expectedPokemon.getHitPoints().getCurrentHitPoints());
    }
}
