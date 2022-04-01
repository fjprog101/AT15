package org.fundacionjala.at15.pokemon.commands.query;

import org.fundacionjala.at15.pokemon.io.Reader;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.Query;
import org.junit.Test;
import picocli.CommandLine;

public class TrainerQueryTest {
    @Test
    public void TrainerQuerySubcommandShouldShowTheFilesInformation() {
        TrainerQuery params = new TrainerQuery();
        new CommandLine(params).parseArgs("-name", "ash");
        params.call();
        ArrayList<String> list = Query.getMatches(EntityType.TRAINER, "ash");
        for (String item : list) {
            Reader.readJson(item);
        }
        Integer expected = 0;
        assertEquals(expected, params.call());
    }

}