package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

import org.fundacionjala.at15.pokemon.ID.Identifier;

public class Trainer extends Entity {
    private String name;
    private Wallet wallet = new Wallet();
    private PokemonTeam pokemonTeam;
    private int badge;
    private ArrayList<HealingPotion> healingPotions = new ArrayList<HealingPotion>();
    private ArrayList<Pokeball> pokeballs = new ArrayList<Pokeball>();

    //initial pokemon for trainer and trainer name
    public Trainer(Pokemon pokemon, String newName) {
        this.identifier = Identifier.generateIdTrainer(this);
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

    //get current pokemon used
    public Pokemon currentPokemon(int current) {
        return pokemonTeam.getPokemonsOfTeam().get(current);
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
}
