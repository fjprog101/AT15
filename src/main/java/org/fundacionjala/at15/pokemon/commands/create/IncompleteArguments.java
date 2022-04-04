package org.fundacionjala.at15.pokemon.commands.create;

public class IncompleteArguments extends Exception {

    public void warningCreatePokemon() {
        System.out.print("ERROR. Incomplete arguments for the create pokemon command. Must assign name and hitpoints.");
    }
}
