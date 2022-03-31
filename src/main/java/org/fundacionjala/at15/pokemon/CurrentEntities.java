package org.fundacionjala.at15.pokemon;
import static org.fundacionjala.at15.pokemon.io.EntityType.*;
import org.fundacionjala.at15.pokemon.ID.Identifier;

public class CurrentEntities extends Entity {
    private String pokemon = "";
    private String trainer = "";
    private String town = "";
    private String battle = "";

    public CurrentEntities() {
        this.id = Identifier.generateId(this);
        this.type = CURRENT;
    }

    public String getPokemon() {
        return this.pokemon;
    }

    public String gettrainer() {
        return this.trainer;
    }

    public String getTown() {
        return this.town;
    }

    public String getBattle() {
        return this.battle;
    }

    public void setPokemon(String param) {
        this.pokemon = param;
    }

    public void settrainer(String param) {
        this.trainer = param;
    }

    public void setTown(String param) {
        this.town = param;
    }

    public void setBattle(String param) {
        this.battle = param;
    }

    public String getPrefix() {
        return "crt";
    }
}
