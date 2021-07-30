package board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GameBoardTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    GameBoard gameBoard;

    @BeforeEach
    void init() {
        gameBoard = new GameBoard();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void print_shouldPrintBoardState() {
        // when
        gameBoard.print();

        // then
        assertThat(" | |\n" +
            "-+-+-\n" +
            " | |\n" +
            "-+-+-\n" +
            " | |").isEqualTo(outputStreamCaptor.toString());
    }

    @Test
    void givenAllCellsAreEmpty_listEmptySpaces_shouldListAllOfThem() {
        // given
        int expectedSize = gameBoard.getCells().size();

        // when
        List<Cell> output = gameBoard.getEmptyCells();

        // then
        assertThat(output.size()).isEqualTo(expectedSize);
    }
}