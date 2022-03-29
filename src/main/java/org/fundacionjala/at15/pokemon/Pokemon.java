package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.io.Path.*;

import java.util.ArrayList;

import org.fundacionjala.at15.pokemon.ID.Identifier;

public class Pokemon extends Entity {
    private HitPoints hitPoints;
    private ArrayList<Move> movementList = new ArrayList<Move>();
    private String pokemonName;

    public Pokemon(int newMaxHP, String pokemonName) {
        this.identifier = Identifier.generateId(this);
        this.path = POKEMON;
        hitPoints = new HitPoints(newMaxHP);
        this.pokemonName = pokemonName;
        Move tackle = new Tackle();
        this.movementList.add(0, tackle);
    }

    public ArrayList<Move> getMovementList() {
        return movementList;
    }

    //esta clase tiene conflicto
    public Move getMove(int listMove) {
        int moveDefault = 0;
        return movementList.get(moveDefault);
    }

    public void setMoveToList(int position1To4, Move newMove) {
        this.movementList.add(position1To4, newMove);
    }

    public HitPoints getHitPoints() {
        return this.hitPoints;
    }

    public String getPokemonName() {
        return this.pokemonName;
    }

    public String getPrefix() {
        return "pkm";
    }
}
