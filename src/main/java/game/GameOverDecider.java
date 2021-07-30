package game;

import board.Cell;

import java.util.List;

public class GameOverDecider {

    public boolean isItDraw(List<Cell> cells) {
        return cells.isEmpty();
    }

    public boolean isItHorizontalWin(List<Cell> cells) {
        return false;
    }
}
