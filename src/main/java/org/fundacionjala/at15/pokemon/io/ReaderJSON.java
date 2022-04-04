package org.fundacionjala.at15.pokemon.io;

import org.fundacionjala.at15.pokemon.Entity;

import com.google.gson.Gson;

import org.fundacionjala.at15.pokemon.*;

public class ReaderJSON extends Reader {
    public static Entity readJSON(String subName, String line) {
        if (subName.equals("pkm")) {
            Pokemon entity = new Gson().fromJson(line, Pokemon.class);
            parsePokemonObject(entity);
            return entity;
        }
        if (subName.equals("trn")) {
            Trainer entity = new Gson().fromJson(line, Trainer.class);
            parseTrainerObject(entity);
            return entity;
        }
        if (subName.equals("btt")) {
            TrainerBattle entity = new Gson().fromJson(line, TrainerBattle.class);
            parseTrainerBattleObject(entity);
            return entity;
        }
        if (subName.equals("twn")) {
            Town entity = new Gson().fromJson(line, Town.class);
            parseTownObject(entity);
            return entity;
        }
        if (subName.equals("crt")) {
            CurrentEntities entity = new Gson().fromJson(line, CurrentEntities.class);
            return entity;
        }
        return null;
    }
}
