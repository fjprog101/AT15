package org.fundacionjala.at15.pokemon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.fundacionjala.at15.pokemon.ID.Prefixer;
import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.JsonWriter;
import org.fundacionjala.at15.pokemon.io.Writer;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Entity implements Prefixer {
    protected String id;
    protected EntityType type;

    public String getId() {
        return this.id;
    }

    public EntityType getType() {
        return this.type;
    }

    public void write() {
        new JsonWriter().writeToFile(this);
    }

    public void write(Writer writer) {
        writer.writeToFile(this);
    }
}
