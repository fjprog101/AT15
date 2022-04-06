package org.fundacionjala.at15.pokemon.commands.behavior;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.create.CreateCurrentEntities;
import org.fundacionjala.at15.pokemon.commands.create.CreatePokemon;
import org.fundacionjala.at15.pokemon.commands.create.CreateTrainer;
import org.fundacionjala.at15.pokemon.commands.exceptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.exceptions.WalletException;
import org.junit.Test;

import picocli.CommandLine;

public class BuyItemsTest {
    @Test
    public void commandShouldButAnPokeball() throws IncompleteArguments, WalletException {
        CreatePokemon pokemon = new CreatePokemon();
        new CommandLine(pokemon).parseArgs("-n", "squirtle", "-hp", "100");
        pokemon.call();

        CreateTrainer tra = new CreateTrainer();
        new CommandLine(tra).parseArgs("-n", "AshKetchup", "-pID", pokemon.getIdPokemonCreated());
        tra.call();

        CreateCurrentEntities current = new CreateCurrentEntities();
        new CommandLine(current);
        current.call();

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", tra.getIdTrainerCreated());
        select.call();

        BuyItems buyItems = new BuyItems();
        new CommandLine(buyItems).parseArgs("-buy", "pokeball");
        buyItems.call();

        String expected = buyItems.getItem();
        assertEquals("pokeball", expected);
    }

    @Test
    public void commandShouldButAnPotion() throws IncompleteArguments, WalletException {
        CreatePokemon pokemon = new CreatePokemon();
        new CommandLine(pokemon).parseArgs("-n", "squirtle", "-hp", "100");
        pokemon.call();

        CreateTrainer tra = new CreateTrainer();
        new CommandLine(tra).parseArgs("-n", "AshKetchup", "-pID", pokemon.getIdPokemonCreated());
        tra.call();

        CreateCurrentEntities current = new CreateCurrentEntities();
        new CommandLine(current);
        current.call();

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", tra.getIdTrainerCreated());
        select.call();

        BuyItems buyItems = new BuyItems();
        new CommandLine(buyItems).parseArgs("-buy", "potion");
        buyItems.call();

        String expected = buyItems.getItem();
        assertEquals("potion", expected);
    }

    @Test(expected = IncompleteArguments.class)
    public void commandShouldVerifyTheBuyItemsCommandException() throws WalletException, IncompleteArguments {
        CreatePokemon pokemon = new CreatePokemon();
        new CommandLine(pokemon).parseArgs("-n", "squirtle", "-hp", "100");
        pokemon.call();

        CreateTrainer tra = new CreateTrainer();
        new CommandLine(tra).parseArgs("-n", "AshKetchup", "-pID", pokemon.getIdPokemonCreated());
        tra.call();

        CreateCurrentEntities current = new CreateCurrentEntities();
        new CommandLine(current);
        current.call();

        Select select = new Select();
        new CommandLine(select).parseArgs("-id", tra.getIdTrainerCreated());
        select.call();

        BuyItems buyItems = new BuyItems();
        new CommandLine(buyItems).parseArgs("-buy", "sadsad");
        buyItems.call();
    }
}
