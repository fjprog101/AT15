package org.fundacionjala.at15.pokemon.gonzalo;

public class DamageReceived {
    private int hp;
    private int hitPoints;

    public DamageReceived(int hitPoints, int hp) {
        this.hitPoints = hitPoints;
        this.hp = hp;
    }

    public int getHp() {
        hp = hp - hitPoints;
        return hp;
    }
}
