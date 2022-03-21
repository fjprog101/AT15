package org.fundacionjala.at15.pokemon;

public class Trainer {
    private final int limit = 6;
    private Wallet wallet = new Wallet();
    private String[] teamPokemon = new String[limit];
    private int numberOfPokeballs = 0;
    private int numberOfPotions = 0;

    public Trainer() {

    }

    public boolean usePokeball() {
        if (numberOfPokeballs == 0) {
            return false;
        } else {
            numberOfPokeballs--;
            return true;
        }
    }

    public boolean usePotion() {
        if (numberOfPotions == 0) {
            return false;
        } else {
            numberOfPotions--;
            return true;
        }
    }

    public int getNumberOfPokeballs() {
        return numberOfPokeballs;
    }

    public int getNumberOfPotions() {
        return numberOfPotions;
    }
}
