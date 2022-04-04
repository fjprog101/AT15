package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;

import java.util.ArrayList;

import org.fundacionjala.at15.pokemon.ID.Identifier;
import org.fundacionjala.at15.pokemon.commands.create.IncompleteArguments;

public class Pokemon extends Entity {
    private HitPoints hitPoints;
    private ArrayList<Move> movementList;
    private String pokemonName;

    public Pokemon(int newMaxHP, String pokemonName) throws IncompleteArguments {
        this.id = Identifier.generateId(this);
        this.type = POKEMON;
        if (newMaxHP == 0) {
            throw new IncompleteArguments();
        }
        hitPoints = new HitPoints(newMaxHP);
        if (pokemonName == null) {
            throw new IncompleteArguments();
        }
        this.pokemonName = pokemonName;
        Move tackle = new Move();
        movementList = new ArrayList<Move>();
        this.movementList.add(tackle);
    }

    public ArrayList<Move> getMovementList() {
        return movementList;
    }

    public Move getMove(int move) {
        return movementList.get(move);
    }

    public Move getMove(String moveAttack) {
        for (Move move : movementList) {
            if (move.getMovement().compareTo(moveAttack) == 0) {
                return move;
            }
        }
        return null;
    }

    public void setMoveToList(Move newMove) {
        final int numberOfMoves = 4;
        if (movementList.size() < numberOfMoves) {
            this.movementList.add(newMove);
        }
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
