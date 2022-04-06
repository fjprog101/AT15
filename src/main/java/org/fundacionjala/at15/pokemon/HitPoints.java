package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.HitPoints.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HitPoints {
    private double maxHitPoints;
    private double currentHitPoints;

    public HitPoints() {
    }

    public HitPoints(double maxHp) {
        super();
        this.maxHitPoints = maxHp;
        this.currentHitPoints = maxHitPoints;
    }

    @XmlElement
    public double getMaxHitPoints() {
        return maxHitPoints;
    }

    @XmlElement
    public double getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setMaxHitPoints(double maxHitP) {
        this.maxHitPoints = maxHitP;
    }

    public void setCurrentHitPoints(double currentHp) {
        this.currentHitPoints = currentHp;
    }

    public void fullRestore() {
        this.currentHitPoints = maxHitPoints;

    }


    public boolean is20Percent() {
        return currentHitPoints * PERCENTAGE / maxHitPoints <= TWENTY_PERCENTAGE;
    }

}
