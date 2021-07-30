package board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class BoardTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Board board;

    @BeforeEach
    void init() {
        board = new Board();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void print_shouldPrintBoardState() {
        // when
        board.print();

        // then
        assertThat(" | |\n" +
            "-+-+-\n" +
            " | |\n" +
            "-+-+-\n" +
            " | |").isEqualTo(outputStreamCaptor.toString().trim());
    }
}