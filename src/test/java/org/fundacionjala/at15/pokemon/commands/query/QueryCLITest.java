package org.fundacionjala.at15.pokemon.commands.query;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class QueryCLITest {

    @Test
    public void itShouldReturnErrorCode1() {
        QueryCLI params = new QueryCLI();
        Integer expected = 0;
        assertEquals(expected, params.call());
    }

}