package org.fundacionjala.at15.pokemon.commands.Exeptions;

public class IncompleteArguments extends Exception {
    public IncompleteArguments(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}