package org.fundacionjala.at15.pokemon.pokemon;

import org.fundacionjala.at15.pokemon.pokemon.moves.Move;

public class Pokemon {
    private static final int MAX_QUANTITY_MOVES = 4;
    private static final double TWENTY_PERCENT = 0.20;
    private int maxHealthPoints;
    private int currentHealthPoints;
    private double twentyPercentMaxHealthPoints;
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
        this.maxHealthPoints = newMaxHP;
        this.currentHealthPoints = maxHealthPoints;

    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public Move getMove(int listPosition) {
        return movementList[listPosition - 1];
    }

    public boolean is20Percent() {
        return is20Percent;
    }

    public void setCurrentHealthPoints(int damageReceived) {
        this.currentHealthPoints = this.currentHealthPoints - damageReceived;
        twentyPercentMaxHealthPoints();
        twentyPercentCheck();
    }

    public void setCurrentHealthPointsWithPotion() {
        this.currentHealthPoints = this.maxHealthPoints;
    }

    public void setMoveToList(Move newMove, int position1To4) {
        this.movementList[position1To4 - 1] = newMove;
    }

    private void twentyPercentMaxHealthPoints() {
        this.twentyPercentMaxHealthPoints = maxHealthPoints * TWENTY_PERCENT;
    }

    private void twentyPercentCheck() {
        if (currentHealthPoints <= twentyPercentMaxHealthPoints) {
            is20Percent = true;
        }
    }

}
