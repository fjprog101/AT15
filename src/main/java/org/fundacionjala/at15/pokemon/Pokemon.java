package org.fundacionjala.at15.pokemon;

public class Pokemon {
    private static final int MAX_QUANTITY_MOVES = 4;
    private static final int PERCENTAGE = 100;
    private static final int TWENTY_PERCENTAGE = 20;
    private final int maxHitPoints;
    private int currentHitPoints;
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
        return currentHitPoints * PERCENTAGE / maxHitPoints <= TWENTY_PERCENTAGE;
    }

    public void setCurrentHitPoints(int hitPoints) {
        this.currentHitPoints = hitPoints;
    }

    public void setCurrentHealthPointsWithPotion() {
        this.currentHitPoints = this.maxHitPoints;
    }

    public void setMoveToList(Move newMove, int position1To4) {
        this.movementList[position1To4 - 1] = newMove;
    }


}
