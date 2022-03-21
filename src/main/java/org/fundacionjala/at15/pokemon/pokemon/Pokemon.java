package org.fundacionjala.at15.pokemon.pokemon;

import org.fundacionjala.at15.pokemon.pokemon.moves.Move;

public class Pokemon {
    private static final int MAX_QUANTITY_MOVES = 4;
    private static final double TWENTY_PERCENT = 0.20;
    private int maxHitPoints;
    private int currentHitPoints;
    private double twentyPercentMaxHitPoints;
    // the next attributes are for the future
//    private int experience;
//    private int level;
//    private int attack;
//    private int special;
//    private int defense;
//    private int speed;
    private Move[] movementList = new Move[MAX_QUANTITY_MOVES];
    private boolean is20Percent = false;

    public Pokemon(int newMaxHP) {
        this.maxHitPoints = newMaxHP;
        this.currentHitPoints = maxHitPoints;

    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public Move getMove(int listPosition) {
        return movementList[listPosition - 1];
    }

    public boolean is20Percent() {
        return is20Percent;
    }

    public void setCurrentHitPoints(int damageReceived) {
        this.currentHitPoints = this.currentHitPoints - damageReceived;
        twentyPercentMaxHitPoints();
        twentyPercentCheck();
    }

    public void setCurrentHealthPointsWithPotion() {
        this.currentHitPoints = this.maxHitPoints;
    }

    public void setMoveToList(Move newMove, int position1To4) {
        this.movementList[position1To4 - 1] = newMove;
    }

    private void twentyPercentMaxHitPoints() {
        this.twentyPercentMaxHitPoints = maxHitPoints * TWENTY_PERCENT;
    }

    private void twentyPercentCheck() {
        if (currentHitPoints <= twentyPercentMaxHitPoints) {
            is20Percent = true;
        }
    }

}
