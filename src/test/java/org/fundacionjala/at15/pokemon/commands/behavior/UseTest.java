package org.fundacionjala.at15.pokemon.commands.behavior;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.io.FileEraser;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Assert;
import org.junit.Test;
import picocli.CommandLine;

import static org.junit.Assert.fail;

public class UseTest {

    @Test
    public void itShouldUseMovement() throws IncompleteArguments {
        CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
        CreatePokemon params1 = new CreatePokemon();
        new CommandLine(params1).parseArgs("-n", "pikachu", "-hp", "300");
        params1.call();
        current.setPokemon(params1.getIdPokemonCreated());
        CreatePokemon params = new CreatePokemon();
        new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
        params.call();
        current.setPokemonOpponent(params.getIdPokemonCreated());
        current.write();
        Use params2 = new Use();
        new CommandLine(params2).parseArgs("-move", "basicAttack");
        params2.call();
        Pokemon expectedPokemon = (Pokemon) Reader.readJson(current.getPokemonOpponent());

        Assert.assertEquals(60, expectedPokemon.getHitPoints().getCurrentHitPoints());
        
        FileEraser.eraseFile(params.getIdPokemonCreated());
        FileEraser.eraseFile(params1.getIdPokemonCreated());
    }

    @Test
    public void itShouldUseThrowsAnExceptionNullMoveAttack() throws IncompleteArguments {
        try {
            CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
            CreatePokemon params1 = new CreatePokemon();
            new CommandLine(params1).parseArgs("-n", "pikachu", "-hp", "300");
            params1.call();
            current.setPokemon(params1.getIdPokemonCreated());
            CreatePokemon params = new CreatePokemon();
            new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
            params.call();
            current.setPokemonOpponent(params.getIdPokemonCreated());
            current.write();
            Use params2 = new Use();
            params2.setMoveAttack(null);
            params2.call();

            fail();
            FileEraser.eraseFile(params.getIdPokemonCreated());
            FileEraser.eraseFile(params1.getIdPokemonCreated());

            } catch (IncompleteArguments ex) {

            Assert.assertEquals("Error. Incomplete arguments for the Use command. Required arguments: -move.",ex.getMessage());
        }
    }

    @Test
    public void itShouldUseThrowsAnExceptionNullMove() throws IncompleteArguments {
        try {
            CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
            CreatePokemon params1 = new CreatePokemon();
            new CommandLine(params1).parseArgs("-n", "pikachu", "-hp", "300");
            params1.call();
            current.setPokemon(params1.getIdPokemonCreated());
            CreatePokemon params = new CreatePokemon();
            new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
            params.call();
            current.setPokemonOpponent(params.getIdPokemonCreated());
            current.write();
            Use params2 = new Use();
            new CommandLine(params2).parseArgs("-move", "tackle");
            params2.call();

            fail();
            FileEraser.eraseFile(params.getIdPokemonCreated());
            FileEraser.eraseFile(params1.getIdPokemonCreated());

        } catch (IncompleteArguments ex) {

            Assert.assertEquals("Your current Pokemon does not know the move: tackle\n" +
                    "Please, use only learned moves known by your Pokemon.",ex.getMessage());
        }
    }
}
