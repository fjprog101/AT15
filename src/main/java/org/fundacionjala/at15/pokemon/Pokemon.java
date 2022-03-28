package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Pokemon.*;

public class Pokemon {
    private HitPoints hitPoints;

    private Move[] movementList = new Move[MAX_QUANTITY_MOVES];

    private String pokemonName;

    public Pokemon(int newMaxHP, String pokemonName) {

        hitPoints = new HitPoints(newMaxHP);
        this.pokemonName = pokemonName;
        Move tackle = new Tackle();
        this.movementList[0] = tackle;
    }

    public Move[] getMovementList() {
        return movementList;
    }

    public Move getMove(int listPosition) {
        return movementList[listPosition - 1];
    }

    public void setMoveToList(Move newMove, int position1To4) {
        this.movementList[position1To4 - 1] = newMove;
    }

    public HitPoints getHitPoints() {
        return this.hitPoints;
    }

    public String getPokemonName() {
        return this.pokemonName;
    }
}
