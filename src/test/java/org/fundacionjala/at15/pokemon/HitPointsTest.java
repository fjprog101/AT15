package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HitPointsTest {
    @Test
    public void itShouldHaveMaxHP() {
        HitPoints hitPoints = new HitPoints(200);
        assertEquals(200, hitPoints.getMaxHitPoints());
    }

    @Test
    public void itShouldChangeCurrentHP() {
        HitPoints hitPoints = new HitPoints(200);
        hitPoints.setCurrentHitPoints(150);
        assertEquals(150, hitPoints.getCurrentHitPoints());
    }

    @Test
    public void itShouldKnowIf20Percent() {
        HitPoints hitPoints = new HitPoints(200);
        hitPoints.setCurrentHitPoints(2);

        assertTrue(hitPoints.is20Percent());
    }

    @Test
    public void itShouldHealHP() {
        HitPoints hitPoints = new HitPoints(200);
        hitPoints.setCurrentHitPoints(2);
        hitPoints.fullRestore();

        assertEquals(200, hitPoints.getCurrentHitPoints());
    }

    @Test
    public void itShouldSetMaxHitPoints() {
        HitPoints hp = new HitPoints(200);
        hp.setMaxHitPoints(300);
        assertEquals(300, hp.getMaxHitPoints());
    }

}
