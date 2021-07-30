package game;

import board.Cell;

import java.util.List;

public class GameOverDecider {

    public boolean isItDraw(List<Cell> cells) {
        return cells.isEmpty();
    }

    public boolean isItHorizontalWin(List<Cell> cells) {
        List<Cell> firstLine = List.of(new Cell(0, 0), new Cell(0, 1), new Cell(0, 2));
        if (cells.containsAll(firstLine)) {
            return true;
        }
        return false;
    }
}
