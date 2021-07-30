package game;

import board.Cell;

import java.util.List;

public class GameOverDecider {

    public boolean isItDraw(List<Cell> cells) {
        return cells.isEmpty();
    }

    public boolean isItHorizontalWin(List<Cell> cells) {
        List<Cell> firstLine = List.of(new Cell(0, 0), new Cell(0, 1), new Cell(0, 2));
        List<Cell> secondLine = List.of(new Cell(1, 0), new Cell(1, 1), new Cell(1, 2));
        List<Cell> thirdLine = List.of(new Cell(2, 0), new Cell(2, 1), new Cell(2, 2));
        if (cells.containsAll(firstLine) || cells.containsAll(secondLine) || cells.containsAll(thirdLine)) {
            return true;
        }
        return false;
    }
}
