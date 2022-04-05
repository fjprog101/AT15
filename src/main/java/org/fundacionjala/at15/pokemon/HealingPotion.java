package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.HealingPotion.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HealingPotion extends Item implements HPAffecter {
    public HealingPotion() {

        this.setCost(POTION_COST);
    }

    @Override
    public void affectHP(Pokemon pokemon) {

        pokemon.getHitPoints().fullRestore();

    }

}
