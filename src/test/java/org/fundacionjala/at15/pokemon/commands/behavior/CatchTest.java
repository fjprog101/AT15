package org.fundacionjala.at15.pokemon.commands.behavior;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.commands.create.CreateTrainer;
import org.fundacionjala.at15.pokemon.commands.exceptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.exceptions.TrainerItemsException;
import org.fundacionjala.at15.pokemon.io.FileEraser;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Assert;
import org.junit.Test;
import picocli.CommandLine;

public class CatchTest {
    @Test
    public void itShouldCatchPokemon() {
        try {
            CurrentEntities currentEntity = new CurrentEntities();
            currentEntity.write();
            CurrentEntities current = (CurrentEntities) Reader.read(currentEntity.getId());
            CreatePokemon params = new CreatePokemon();
            new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
            params.call();
            current.setPokemonOpponent(params.getIdPokemonCreated());
            current.write();
            Pokemon wildPokemon = (Pokemon) Reader.read(current.getPokemonOpponent());
            wildPokemon.getHitPoints().setCurrentHitPoints(10);
            wildPokemon.write();
            current.write();
            CreatePokemon params2 = new CreatePokemon();
            new CommandLine(params2).parseArgs("-n", "pikachu", "-hp", "111");
            params2.call();
            CreateTrainer red = new CreateTrainer();
            new CommandLine(red).parseArgs("-n", "Red", "-pID", params2.getIdPokemonCreated());
            red.call();
            current.setTrainer(red.getIdTrainerCreated());
            current.write();
            Catch params3 = new Catch();
            params3.call();
            current = (CurrentEntities) Reader.read(currentEntity.getId());
            FileEraser.eraseFile(params.getIdPokemonCreated());
            FileEraser.eraseFile(params2.getIdPokemonCreated());
            FileEraser.eraseFile(red.getIdTrainerCreated());

            Assert.assertEquals("", current.getPokemonOpponent());


        } catch (TrainerItemsException e) {

        } catch (IncompleteArguments f) {

        }
    }

    @Test
    public void itShouldNotCatchPokemon() {
        try {
            CurrentEntities currentEntity = new CurrentEntities();
            currentEntity.write();
            CurrentEntities current = (CurrentEntities) Reader.read(currentEntity.getId());
            CreatePokemon params = new CreatePokemon();
            new CommandLine(params).parseArgs("-n", "squirtle", "-hp", "100");
            params.call();
            current.setPokemonOpponent(params.getIdPokemonCreated());
            current.write();
            Pokemon wildPokemon = (Pokemon) Reader.read(current.getPokemonOpponent());
            wildPokemon.getHitPoints().setCurrentHitPoints(50);
            wildPokemon.write();
            current.write();
            CreatePokemon params2 = new CreatePokemon();
            new CommandLine(params2).parseArgs("-n", "pikachu", "-hp", "100");
            params2.call();
            CreateTrainer red = new CreateTrainer();
            new CommandLine(red).parseArgs("-n", "Red", "-pID", params2.getIdPokemonCreated());
            red.call();
            current.setTrainer(red.getIdTrainerCreated());
            current.write();
            Catch params3 = new Catch();
            params3.call();
            current = (CurrentEntities) Reader.read(currentEntity.getId());
            FileEraser.eraseFile(params.getIdPokemonCreated());
            FileEraser.eraseFile(params2.getIdPokemonCreated());
            FileEraser.eraseFile(red.getIdTrainerCreated());


            Assert.assertEquals(params.getIdPokemonCreated(), current.getPokemonOpponent());


        } catch (TrainerItemsException e) {

        } catch (IncompleteArguments f) {

        }
    }
}
