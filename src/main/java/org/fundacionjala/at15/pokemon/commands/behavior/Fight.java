package org.fundacionjala.at15.pokemon.commands.behavior;


import java.util.concurrent.Callable;

import org.fundacionjala.at15.pokemon.CurrentEntities;
import org.fundacionjala.at15.pokemon.io.Reader;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "fight", description = "Fight")
public class Fight implements Callable<Integer> {
    @Option(names = { "-id" }, description = "Fight")
    private String entityID;

    @Override
    public Integer call() {
        if (entityID != null) {
            CurrentEntities current = (CurrentEntities) Reader.readJson("crt-12345678");
            assert current != null;
            current.setPokemonOpponent(entityID);
            current.write();
        } else {
            System.out.println("A Pokemon Wild ID is needed");
        }
        return 0;
    }
}
