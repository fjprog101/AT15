package pokemon;

import static org.junit.Assert.assertEquals;
import org.fundacionjala.at15.pokemon.pokemon.moves.Move;
import org.fundacionjala.at15.pokemon.pokemon.moves.Tackle;
import org.junit.Test;

public class TackleTest {
    @Test
    public void itShouldHavePotency() {
        Move tackle = new Tackle();

        assertEquals(40, tackle.getPotency());
    }
}
