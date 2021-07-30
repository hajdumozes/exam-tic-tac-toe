package player;

import board.Cell;

import java.util.List;

public class Player {

    public Cell pickCell(List<Cell> availableCells) {
        return availableCells.get(0);
    }
}
