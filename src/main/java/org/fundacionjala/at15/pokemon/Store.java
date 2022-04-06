package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.HealingPotion.*;
import static org.fundacionjala.at15.pokemon.constants.Pokeball.*;

import javax.xml.bind.annotation.*;

import org.fundacionjala.at15.pokemon.commands.exceptions.WalletException;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Store {

    public static void buyPokeball(Trainer trainer) throws WalletException {
        trainer.getPokeballs().add(new Pokeball());
        trainer.getWallet().spendMoney(POKEBALL_COST);
    }

    public static void buyHealingPotion(Trainer trainer) throws WalletException {
        trainer.getHealingPotions().add(new HealingPotion());
        trainer.getWallet().spendMoney(POTION_COST);
    }

    public static void sellPokeball(Trainer trainer) {
        if (trainer.getPokeballs().size() > 0) {
            trainer.getPokeballs().remove(0);
            trainer.getWallet().winMoney(POKEBALL_COST);
        }
    }

    public static void sellHealingPotion(Trainer trainer) {
        if (trainer.getHealingPotions().size() > 0) {
            trainer.getHealingPotions().remove(0);
            trainer.getWallet().winMoney(POTION_COST);
        }
    }
}
