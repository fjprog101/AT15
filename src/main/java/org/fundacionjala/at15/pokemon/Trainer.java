package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private Wallet wallet = new Wallet();
    private PokemonTeam pokemonTeam;
    private ArrayList<HealingPotion> healingPotions = new ArrayList<HealingPotion>();
    private ArrayList<Pokeball> pokeballs = new ArrayList<Pokeball>();

    //initial pokemon for trainer and trainer name
    public Trainer(Pokemon pokemon, String newName) {
        this.pokemonTeam = new PokemonTeam(pokemon);
        this.name = newName;
    }

    //get current pokemon used
    public Pokemon currentPokemon(int current) {
        return pokemonTeam.getPokemonTeam().get(current);
    }

    //use the healing potion in the current pokemon
    public void useHealingPotion(int current) {
        if (healingPotions.size() != 0) {
            HealingPotion currentPotion = healingPotions.get(healingPotions.size() - 1);
            currentPotion.affectHP(currentPokemon(current));
            healingPotions.remove(healingPotions.size() - 1);
        }
    }

    //use pokeball on wild pokemon
    public void usePokeball(Pokemon pokemon) {
        if (pokeballs.size() != 0) {
            Pokeball currentPokeball = pokeballs.get(pokeballs.size() - 1);
            if (currentPokeball.catchPokemon(pokemon)) {
                pokemonTeam.addPokemon(pokemon);
            }
            pokeballs.remove(pokeballs.size() - 1);
        }
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public PokemonTeam getPokemonTeam() {
        return pokemonTeam;
    }

    public ArrayList getHealingPotion() {
        return healingPotions;
    }

    public ArrayList getPokeballs() {
        return pokeballs;
    }
}
