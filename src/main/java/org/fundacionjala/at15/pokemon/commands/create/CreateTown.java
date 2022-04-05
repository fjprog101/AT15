package org.fundacionjala.at15.pokemon.commands.create;

import org.fundacionjala.at15.pokemon.Town;
import org.fundacionjala.at15.pokemon.commands.exceptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.io.JsonWriter;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "town", description = "Create a town")
public class CreateTown implements Callable<Integer> {
    private String idCreateTown;

    @Option(names = { "-nameTown", "-nt" }, description = "name town")
    private String townName;

    @Override
    public Integer call() throws IncompleteArguments {
        if ((townName == null)) {
            throw new IncompleteArguments(
                    "Error. Incomplete arguments for the create town command. Required arguments: -name",
                    null, true, false);
        }
        Town newTown = new Town(townName);
        newTown.write(new JsonWriter());
        idCreateTown = newTown.getId();
        System.out.println(
                "Town Created: \n"
                        + newTown.getName() + " name town" + "\n"
                        + "ID: " + idCreateTown);

        return 0;
    }

    public String getIdCreateTrainerBattle() {
        return idCreateTown;
    }

}
