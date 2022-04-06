package org.fundacionjala.at15.pokemon.commands.exceptions;

public class WalletException extends Exception {
    public WalletException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
