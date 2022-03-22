package org.fundacionjala.at15.pokemon;

public class Pokemon {
    private static final int MAX_QUANTITY_MOVES = 4;

    private HitPoints hitPoints;

    private Move[] movementList = new Move[MAX_QUANTITY_MOVES];

    public Pokemon(int newMaxHP) {

        hitPoints = new HitPoints(newMaxHP);

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



}
