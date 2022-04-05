package org.fundacionjala.at15.pokemon;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.fundacionjala.at15.pokemon.ID.Prefixer;
import org.fundacionjala.at15.pokemon.io.EntityType;
import org.fundacionjala.at15.pokemon.io.JsonWriter;
import org.fundacionjala.at15.pokemon.io.Writer;

@XmlRootElement
public abstract class Entity implements Prefixer {
    protected String id;
    protected EntityType type;

    @XmlElement
    public String getId() {
        return this.id;
    }

    @XmlElement
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
