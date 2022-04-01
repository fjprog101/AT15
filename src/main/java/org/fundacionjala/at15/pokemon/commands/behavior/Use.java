package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.DamageReceived;
import org.fundacionjala.at15.pokemon.Move;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.io.Reader;
import static org.fundacionjala.at15.pokemon.io.Writer.*;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "use", description = "Use an attacking move")
public class Use implements Callable<Integer> {
    @Option(names = { "-move" }, description = "Pokemon Movement", defaultValue = "tackle")
    private String moveAttack;

    @Override
    public Integer call() {
        if (moveAttack != null) {
            CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
            Pokemon wildPokemon = (Pokemon) Reader.readJson(current.getPokemonOpponent());
            Pokemon pokemon = (Pokemon) Reader.readJson(current.getPokemon());
            Move move = pokemon.getMove(moveAttack);

            if (move != null) {
                DamageReceived damageDealer = new DamageReceived(move.getPotency());
                damageDealer.affectHP(wildPokemon);

                writeToJson(wildPokemon);

                System.out.println(wildPokemon.getPokemonName() + " has now: "
                                    + wildPokemon.getHitPoints().getCurrentHitPoints()
                                    + " HitPoints");
            } else {
                System.out.println("Your current Pokemon does not known to use: " + moveAttack + "\n"
                        + "Please, use only learned attacks by your Pokemon.");
            }
        } else {
            System.out.println("A Move Attack is needed.");
        }

        return 0;
    }
}
