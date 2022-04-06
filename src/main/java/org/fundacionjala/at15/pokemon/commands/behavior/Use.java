package org.fundacionjala.at15.pokemon.commands.behavior;

import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.DamageReceived;
import org.fundacionjala.at15.pokemon.Move;
import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.commands.exceptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.io.Reader;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "use", description = "Use an attacking move")
public class Use implements Callable<Integer> {
    @Option(names = { "-move" }, description = "Pokemon Movement", defaultValue = "tackle")
    private String moveAttack;

    public void setMoveAttack(String newMoveAttack) {
        this.moveAttack = newMoveAttack;
    }

    @Override
    public Integer call() throws IncompleteArguments {
        if (moveAttack != null) {
            CurrentEntities current = (CurrentEntities) Reader.read("crt-12345678");
            assert current != null;
            Pokemon wildPokemon = (Pokemon) Reader.read(current.getPokemonOpponent());
            Pokemon pokemon = (Pokemon) Reader.read(current.getPokemon());
            assert pokemon != null;
            Move move = pokemon.getMove(moveAttack);

            if (move != null) {
                DamageReceived damageDealer = new DamageReceived(move.getPotency());
                assert wildPokemon != null;
                damageDealer.affectHP(wildPokemon, pokemon.getPokemonType());

                if (wildPokemon.getHitPoints().getCurrentHitPoints() > 0) {
                    DamageReceived damageDelivered = new DamageReceived(
                            wildPokemon.getMove("basicAttack").getPotency());
                    damageDelivered.affectHP(pokemon, wildPokemon.getPokemonType());
                }

                wildPokemon.write();

                System.out.println("Wild " + wildPokemon.getPokemonName() + " has now: "
                        + wildPokemon.getHitPoints().getCurrentHitPoints()
                        + " HP" + "\n" + pokemon.getPokemonName()
                        + " has now: " + pokemon.getHitPoints().getCurrentHitPoints()
                        + " HP");
            } else {
                throw new IncompleteArguments(
                        "Your current Pokemon does not know the move: " + moveAttack + "\n"
                                + "Please, use only learned moves known by your Pokemon.",
                        null, true, false);
            }
        } else {
            throw new IncompleteArguments(
                    "Error. Incomplete arguments for the Use command. Required arguments: -move.",
                    null, true, false);
        }

        return 0;
    }
}
