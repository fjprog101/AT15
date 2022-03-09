package org.fundacionjala.at15.katas.pokerhands;

public class ClubCard extends Card {

    public ClubCard(char value) {
        super(value, 'C');
    }

    @Override
    public int compareTo(Card card) {
        return 0;
    }
}
