package org.fundacionjala.at15.pokemon;

public class Center implements HPAffecter {

    public void affectHP(Pokemon pokemon) {
        pokemon.getHitPoints().fullRestore();
    }
}
