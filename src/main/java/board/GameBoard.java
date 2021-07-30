package board;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GameBoard {
    List<Cell> cells;

    public GameBoard() {
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
        System.out.print(" | |\n" +
            "-+-+-\n" +
            " | |\n" +
            "-+-+-\n" +
            " | |");
    }

    public List<Cell> getEmptyCells() {
        return cells;
    }
}
