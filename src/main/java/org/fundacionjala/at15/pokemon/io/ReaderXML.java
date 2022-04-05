package org.fundacionjala.at15.pokemon.io;

import org.fundacionjala.at15.pokemon.*;

import java.io.*;

import javax.xml.bind.*;

public class ReaderXML extends Reader {
    public static Entity readXML(String subName, String line) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Pokemon.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Pokemon pokemon = (Pokemon) jaxbUnmarshaller.unmarshal(new StringReader(line));

            System.out.println(pokemon);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        /*if (subName.equals("pkm")) {

            parsePokemonObject(entity);
            return entity;
        }
        if (subName.equals("trn")) {

            parseTrainerObject(entity);
            return entity;
        }
        if (subName.equals("btt")) {

            parseTrainerBattleObject(entity);
            return entity;
        }
        if (subName.equals("twn")) {

            parseTownObject(entity);
            return entity;
        }
        if (subName.equals("crt")) {

            return entity;
        }*/
        return null;
    }
}
