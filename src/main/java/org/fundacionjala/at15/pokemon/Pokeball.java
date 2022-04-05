package org.fundacionjala.at15.pokemon;

import static org.fundacionjala.at15.pokemon.constants.Pokeball.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pokeball extends Item {
    public Pokeball() {
        this.cost = POKEBALL_COST;
    }

    public boolean catchPokemon(Pokemon poke) {
        return poke.getHitPoints().is20Percent();
    }
}