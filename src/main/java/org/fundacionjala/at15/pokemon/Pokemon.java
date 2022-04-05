package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.fundacionjala.at15.pokemon.ID.Identifier;

@XmlRootElement
public class Pokemon extends Entity {
    private HitPoints hitPoints;
    private ArrayList<Move> movementList = new ArrayList<Move>();
    private String pokemonName;

    public Pokemon() {
        this.id = Identifier.generateId(this);
    }

    public Pokemon(int newMaxHP, String pokemonName) {
        this.id = Identifier.generateId(this);
        this.type = POKEMON;
        this.hitPoints = new HitPoints(newMaxHP);
        this.pokemonName = pokemonName;
        Move tackle = new Move();
        this.movementList.add(tackle);
    }

    @XmlElement
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

    @XmlElement
    public HitPoints getHitPoints() {
        return this.hitPoints;
    }

    @XmlElement
    public String getPokemonName() {
        return this.pokemonName;
    }

    public String getPrefix() {
        return "pkm";
    }
}
