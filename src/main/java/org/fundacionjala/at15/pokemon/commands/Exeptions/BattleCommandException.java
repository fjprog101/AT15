package org.fundacionjala.at15.pokemon.commands.Exeptions;

public class BattleCommandException extends Exception {
    public BattleCommandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
