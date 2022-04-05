package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.HealingPotion.*;
import static org.fundacionjala.at15.pokemon.constants.Pokeball.*;

public class Store {

    public static void buyPokeball(Trainer trainer) {
        trainer.getPokeballs().add(new Pokeball());
        trainer.getWallet().spendMoney(POKEBALL_COST);
    }

    public static void buyHealingPotion(Trainer trainer) {
        trainer.getHealingPotion().add(new HealingPotion());
        trainer.getWallet().spendMoney(POTION_COST);
    }

    public static void sellPokeball(Trainer trainer) {
        if (trainer.getPokeballs().size() > 0) {
            trainer.getPokeballs().remove(0);
            trainer.getWallet().winMoney(POKEBALL_COST);
        }
    }

    public static void sellHealingPotion(Trainer trainer) {
        if (trainer.getHealingPotion().size() > 0) {
            trainer.getHealingPotion().remove(0);
            trainer.getWallet().winMoney(POTION_COST);
        }
    }
}
