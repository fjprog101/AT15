package org.fundacionjala.at15.pokemon;

public class Store {

    public static void buyPokeball(Trainer trainer) {
        trainer.getPokeballs().add(new Pokeball());
        trainer.getWallet().spendMoney(Pokeball.POKEBALL_COST);
    }

    public static void buyHealingPotion(Trainer trainer) {
        trainer.getHealingPotion().add(new HealingPotion());
        trainer.getWallet().spendMoney(HealingPotion.POTION_COST);
    }

    public static void sellPokeball(Trainer trainer) {
        if (trainer.getPokeballs().size() > 0) {
            trainer.getPokeballs().remove(0);
            trainer.getWallet().winMoney(Pokeball.POKEBALL_COST);
        }
    }

    public static void sellHealingPotion(Trainer trainer) {
        if (trainer.getHealingPotion().size() > 0) {
            trainer.getHealingPotion().remove(0);
            trainer.getWallet().winMoney(HealingPotion.POTION_COST);
        }
    }
}
