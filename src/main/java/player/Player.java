package player;

import board.Cell;

import java.util.List;
import java.util.Random;

public class Player {

    public Cell pickCell(List<Cell> availableCells) {
        int randomIndex = new Random().nextInt(availableCells.size());
        return availableCells.get(randomIndex);
    }
}
