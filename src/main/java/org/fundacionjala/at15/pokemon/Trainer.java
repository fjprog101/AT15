package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.commands.exceptions.TrainerItemsException;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;

public class Trainer extends Entity {
    private String name;
    private Wallet wallet = new Wallet();
    private PokemonTeam pokemonTeam;
    private int badge;
    private ArrayList<HealingPotion> healingPotions = new ArrayList<HealingPotion>();
    private ArrayList<Pokeball> pokeballs = new ArrayList<Pokeball>();

    public Trainer(Pokemon pokemon, String newName) {
        this.id = Identifier.generateId(this);
        this.type = TRAINER;
        Pokeball pokeball = new Pokeball();
        this.pokemonTeam = new PokemonTeam(pokemon);
        this.name = newName;
        this.pokeballs.add(pokeball);
        this.pokeballs.add(pokeball);
        this.pokeballs.add(pokeball);
        this.pokeballs.add(pokeball);
        this.pokeballs.add(pokeball);
        this.badge = 0;
    }

    public Pokemon currentPokemon(int current) {
        return pokemonTeam.getPokemonsOfTeam().get(current);
    }

    public void useHealingPotion(int current) throws TrainerItemsException {
        if (healingPotions.size() == 0) {
            throw new TrainerItemsException("There are no more potions!", null, true, false);
        }
        HealingPotion currentPotion = healingPotions.get(healingPotions.size() - 1);
        currentPotion.affectHP(currentPokemon(current));
        healingPotions.remove(healingPotions.size() - 1);
    }

    public void usePokeball(Pokemon pokemon) throws TrainerItemsException {
        if (pokeballs.size() == 0) {
            throw new TrainerItemsException("There are no more pokeballs!", null, true, false);
        }
        Pokeball currentPokeball = pokeballs.get(pokeballs.size() - 1);
        if (currentPokeball.catchPokemon(pokemon)) {
            pokemonTeam.addPokemon(pokemon);
        }
        pokeballs.remove(pokeballs.size() - 1);
    }

    public void winBadge() {
        badge++;
    }

    public String getName() {
        return this.name;
    }

    public Wallet getWallet() {
        return this.wallet;
    }

    public int getBadge() {
        return badge;
    }

    public PokemonTeam getPokemonTeam() {
        return this.pokemonTeam;
    }

    public ArrayList<HealingPotion> getHealingPotion() {
        return this.healingPotions;
    }

    public ArrayList<Pokeball> getPokeballs() {
        return this.pokeballs;
    }

    public String getPrefix() {
        return "trn";
    }
}
