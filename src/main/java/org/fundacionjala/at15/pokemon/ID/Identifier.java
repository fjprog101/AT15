package org.fundacionjala.at15.pokemon.ID;

import org.fundacionjala.at15.pokemon.Pokemon;
import org.fundacionjala.at15.pokemon.Trainer;

public class Identifier {

    public String generateIdPokemon(Pokemon pokemon) {
        String identifier = "pkm";
        int hCode = pokemon.hashCode();
        String identifierPkm = Integer.toString(hCode);
        identifier = identifier + identifierPkm;
        return identifier;
    }

    public String generateIdTrainer(Trainer trainer) {
        String identifier = "trn";
        int hCode = trainer.hashCode();
        String identifierTrn = Integer.toString(hCode);
        identifier = identifier + identifierTrn;
        return identifier;
    }
}