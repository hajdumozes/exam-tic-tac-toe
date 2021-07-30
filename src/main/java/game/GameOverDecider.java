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
        return cells.containsAll(firstLine) || cells.containsAll(secondLine) || cells.containsAll(thirdLine);
    }

    public boolean isItVerticalWin(List<Cell> cells) {
        List<Cell> firstColumn = List.of(new Cell(0, 0), new Cell(1, 0), new Cell(2, 0));
        List<Cell> secondColumn = List.of(new Cell(0, 1), new Cell(1, 1), new Cell(2, 1));
        List<Cell> thirdColumn = List.of(new Cell(0, 2), new Cell(1, 2), new Cell(2, 2));
        return cells.containsAll(firstColumn) || cells.containsAll(secondColumn) || cells.containsAll(thirdColumn);
    }

    public boolean isItDiagonalWin(List<Cell> cells) {
        List<Cell> firstColumn = List.of(new Cell(0, 0), new Cell(1, 0), new Cell(2, 0));
        List<Cell> secondColumn = List.of(new Cell(0, 1), new Cell(1, 1), new Cell(2, 1));
        return cells.containsAll(firstColumn) || cells.containsAll(secondColumn);
    }
}
