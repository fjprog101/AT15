package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.Store;
import org.fundacionjala.at15.pokemon.Trainer;
import org.fundacionjala.at15.pokemon.commands.exceptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.exceptions.WalletException;
import org.fundacionjala.at15.pokemon.io.Reader;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "use", description = "Use an attacking move")
public class BuyItems implements Callable<Integer> {
    @Option(names = { "-buy" }, description = "Buy an item")
    private String buyItem;

    @Override
    public Integer call() throws IncompleteArguments, WalletException {

        CurrentEntities current = (CurrentEntities) Reader.read("crt-12345678");
        Trainer trainer = (Trainer) Reader.read(current.gettrainer());
        if (!(buyItem.equals("potion") || buyItem.equals("pokeball"))) {
            throw new IncompleteArguments(
                    "Error. The only available items are potion and pokeball, use -buy: 'potion' or 'pokeball'",
                    null, true, false);
        }
        if (buyItem.equals("potion")) {
            Store.buyHealingPotion(trainer);
        } else if (buyItem.equals("pokeball")) {
            Store.buyPokeball(trainer);
        }
        trainer.write();
        System.out.println(
                "Purchased item: \n"
                        + "Trainer: " + trainer.getId() + "\n"
                        + "Name: " + trainer.getName() + "\n"
                        + "Actual money: " + trainer.getWallet().getMoneyInWallet() + "\n"
                        + "Actual potions: " + trainer.getHealingPotions().size() + "\n"
                        + "Actual pokeballs: " + trainer.getPokeballs().size());
        return 0;
    }

    public String getItem() {
        return buyItem;
    }
}
