package org.fundacionjala.at15.pokemon.commands.query;

import org.fundacionjala.at15.pokemon.io.Reader;
import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.pokemon.Trainer;
import org.junit.Test;
import picocli.CommandLine;

public class TrainerQueryTest {
    @Test
    public void TrainerQuerySubcommandShouldShowTheFilesInformation() {
        TrainerQuery params = new TrainerQuery();
        new CommandLine(params).parseArgs("-name", "Ash1");
        params.call();
        Trainer trainer = (Trainer) Reader.readJson(params.getList().get(0));
        String expected = trainer.getName();
        assertEquals("Ash1", expected);
    }

}