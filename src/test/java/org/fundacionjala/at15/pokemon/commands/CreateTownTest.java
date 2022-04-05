package org.fundacionjala.at15.pokemon.commands;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.commands.Exeptions.IncompleteArguments;
import org.fundacionjala.at15.pokemon.commands.create.CreateTown;
import org.fundacionjala.at15.pokemon.io.Reader;
import org.junit.Test;
import picocli.CommandLine;

public class CreateTownTest {
    @Test
    public void commandShouldCreateATwonJsonFile() throws IncompleteArguments {
        CreateTown townCLI = new CreateTown();
        new CommandLine(townCLI).parseArgs("-nt", "Paleta");
        townCLI.call();
        Reader.readJson(townCLI.getIdCreateTrainerBattle());
        String expected = "id: " + townCLI.getIdCreateTrainerBattle() + " town's gym leader name: gymLeader";
        assertEquals(expected, Reader.getResult());
    }

    @Test(expected = IncompleteArguments.class)
    public void commandShould() throws IncompleteArguments {
        CreateTown town = new CreateTown();
        new CommandLine(town).parseArgs();
        town.call();
    }
}
