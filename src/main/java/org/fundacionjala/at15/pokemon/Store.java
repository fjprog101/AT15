package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;

public class Store {

    private ArrayList<Trainer> trainers;

    public Store() {
        this.trainers = new ArrayList<Trainer>();
    }

    public void buyPokeball(ArrayList<Pokeball> pokeballs, Wallet wallet) {
        pokeballs.add(new Pokeball());
        wallet.spendMoney(Pokeball.POKEBALL_COST);
    }

    public void buyHealingPotion(ArrayList<HealingPotion> potions, Wallet wallet) {
        potions.add(new HealingPotion());
        wallet.spendMoney(HealingPotion.POTION_COST);
    }

    public ArrayList<Trainer> getTrainers() {
        return this.trainers;
    }

    public void addTrainer(Trainer trainer) {
        this.trainers.add(trainer);
    }
}
