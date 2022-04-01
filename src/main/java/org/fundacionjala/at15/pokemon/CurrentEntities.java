package org.fundacionjala.at15.pokemon;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;

public class CurrentEntities extends Entity {
    private String pokemon = "";
    private String trainer = "";
    private String town = "";
    private String battle = "";
    private String pokemonOpponent = "";

    public CurrentEntities() {
        this.id = "crt-12345678";
        this.type = CURRENT;
    }

    public String getPokemon() {
        return this.pokemon;
    }

    public String gettrainer() {
        return this.trainer;
    }

    public String getTown() {
        return this.town;
    }

    public String getBattle() {
        return this.battle;
    }

    public String getPokemonOpponent() {
        return this.pokemonOpponent;
    }

    public void setPokemon(String pokemonID) {
        this.pokemon = pokemonID;
    }

    public void settrainer(String trainerID) {
        this.trainer = trainerID;
    }

    public void setTown(String townID) {
        this.town = townID;
    }

    public void setBattle(String battleID) {
        this.battle = battleID;
    }

    public void setPokemonOpponent(String pokemonOpponentID) {
        this.pokemonOpponent = pokemonOpponentID;
    }

    public String getPrefix() {
        return "crt";
    }
}
