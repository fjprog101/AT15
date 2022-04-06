package org.fundacionjala.at15.pokemon.io;

import org.fundacionjala.at15.pokemon.*;

import java.io.*;

import javax.xml.bind.*;

public class ReaderXML extends Reader {
    public static Entity readXML(String subName, File line) {
        JAXBContext jaxbContext;
        if (subName.equals("pkm")) {
            try {
                jaxbContext = JAXBContext.newInstance(Pokemon.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Pokemon entity = (Pokemon) jaxbUnmarshaller.unmarshal(line);
                parsePokemonObject(entity);
                return entity;
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
        if (subName.equals("trn")) {
            try {
                jaxbContext = JAXBContext.newInstance(Trainer.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Trainer entity = (Trainer) jaxbUnmarshaller.unmarshal(line);
                parseTrainerObject(entity);
                return entity;
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
        if (subName.equals("btt")) {
            try {
                jaxbContext = JAXBContext.newInstance(TrainerBattle.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                TrainerBattle entity = (TrainerBattle) jaxbUnmarshaller.unmarshal(line);
                parseTrainerBattleObject(entity);
                return entity;
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
        if (subName.equals("twn")) {
            try {
                jaxbContext = JAXBContext.newInstance(Town.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Town entity = (Town) jaxbUnmarshaller.unmarshal(line);
                parseTownObject(entity);
                return entity;
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
        if (subName.equals("crt")) {
            try {
                jaxbContext = JAXBContext.newInstance(CurrentEntities.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                CurrentEntities entity = (CurrentEntities) jaxbUnmarshaller.unmarshal(line);
                return entity;
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
