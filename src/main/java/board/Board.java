package board;

import lombok.Data;

import java.util.List;

@Data
public class Board {
    List<Cell> cells;

    public Board() {
        this.cells = List.of(
            new Cell(0, 0),
            new Cell(0, 1),
            new Cell(0, 2),
            new Cell(1, 0),
            new Cell(1, 1),
            new Cell(1, 2),
            new Cell(2, 0),
            new Cell(2, 1),
            new Cell(2, 3)
        );
    }

    public void print() {
    }
}
