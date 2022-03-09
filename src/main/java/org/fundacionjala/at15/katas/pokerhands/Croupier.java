package org.fundacionjala.at15.katas.pokerhands;

public class Croupier {

    public String doDecision(int whiteValueCards, int blackValueCards) {
        String decision;
        if (whiteValueCards > blackValueCards) {
            decision = "white";
        } else if (whiteValueCards < blackValueCards) {
            decision = "black";
        } else {
            decision = "Tie";
        }
        return decision;
    }

}
