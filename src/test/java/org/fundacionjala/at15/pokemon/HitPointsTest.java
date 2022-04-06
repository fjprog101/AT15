package org.fundacionjala.at15.pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HitPointsTest {
    @Test
    public void itShouldHaveMaxHP() {
        HitPoints hitPoints = new HitPoints(200);
        double expected = 200;
        assertEquals(expected, hitPoints.getMaxHitPoints(), 0);
    }

    @Test
    public void itShouldChangeCurrentHP() {
        HitPoints hitPoints = new HitPoints(200);
        hitPoints.setCurrentHitPoints(150);
        double expected = 200;
        assertEquals(expected, hitPoints.getMaxHitPoints(), 0);
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
        double expected = 200;
        assertEquals(expected, hitPoints.getCurrentHitPoints(), 0);
    }

    @Test
    public void itShouldSetMaxHitPoints() {
        HitPoints hp = new HitPoints(200);
        hp.setMaxHitPoints(300);
        double expected = 300;
        assertEquals(expected, hp.getMaxHitPoints(),0);
    }

}
