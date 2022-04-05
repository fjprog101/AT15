package org.fundacionjala.at15.pokemon.io;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.fundacionjala.at15.pokemon.Entity;

public class XmlWriter extends Writer {

    @Override
    public void writeToFile(Entity entity) {
        File subPath = new File(entity.getType().getPath());
        PathHandler.checkFolder(subPath);
        String fileName = entity.getId();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(entity.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File(subPath + "/" + fileName + ".xml");
            jaxbMarshaller.marshal(entity, file);
        } catch (JAXBException e) {
            e.printStackTrace(System.out);
        }
    }
}
