package org.fundacionjala.at15.pokemon;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Moves extends Move{
    private int hitPoints;
    List<String> moves = new ArrayList<String>();
    private final int quantityOfMovements = 4;

    public Moves(String nameMove, int hitPoints) {
        if (moves.size() < quantityOfMovements) {
            moves.add(nameMove);
        } else {
            JOptionPane.showMessageDialog(null, "The Pokemon already has 4 moves", nameMove, JOptionPane.INFORMATION_MESSAGE);
        }
        this.hitPoints = hitPoints;
    }

    public void selectMove

    public int getPotency() {
        return hitPoints;
    }
}