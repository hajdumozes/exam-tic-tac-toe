package game;

import board.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GameOverDeciderTest {
    GameOverDecider decider;

    @BeforeEach
    void init() {
        decider = new GameOverDecider();
    }

    @Test
    void givenNoCellLeft_isItDraw_shouldReturnTrue() {
        // given
        List<Cell> input = List.of();

        // when
        boolean output = decider.isItDraw(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenCellsAreLeft_isItDraw_shouldReturnFalse() {
        // given
        List<Cell> input = List.of(new Cell(1, 1));

        // when
        boolean output = decider.isItDraw(input);

        // then
        assertThat(output).isFalse();
    }

    @Test
    void givenFistLine_isItHorizontalWin_shouldReturnTrue() {
        // given
        List<Cell> input = List.of(new Cell(0, 0), new Cell(0, 1), new Cell(0, 2));

        // when
        boolean output = decider.isItHorizontalWin(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenSecondLine_isItHorizontalWin_shouldReturnTrue() {
        // given
        List<Cell> input = List.of(new Cell(1, 0), new Cell(1, 1), new Cell(1, 2));

        // when
        boolean output = decider.isItHorizontalWin(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenThirdLine_isItHorizontalWin_shouldReturnTrue() {
        // given
        List<Cell> input = List.of(new Cell(2, 0), new Cell(2, 1), new Cell(2, 2));

        // when
        boolean output = decider.isItHorizontalWin(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenNoLine_isItHorizontalWin_shouldReturnFalse() {
        // given
        List<Cell> input = List.of(new Cell(2, 1), new Cell(2, 2), new Cell(1, 2));

        // when
        boolean output = decider.isItHorizontalWin(input);

        // then
        assertThat(output).isFalse();
    }

    @Test
    void givenFistColumn_isItVerticalWin_shouldReturnTrue() {
        // given
        List<Cell> input = List.of(new Cell(0, 0), new Cell(1, 0), new Cell(2, 0));

        // when
        boolean output = decider.isItVerticalWin(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenSecondColumn_isItVerticalWin_shouldReturnTrue() {
        // given
        List<Cell> input = List.of(new Cell(0, 1), new Cell(1, 1), new Cell(2, 1));

        // when
        boolean output = decider.isItVerticalWin(input);

        // then
        assertThat(output).isTrue();
    }

    @Test
    void givenThirdColumn_isItVerticalWin_shouldReturnTrue() {
        // given
        List<Cell> input = List.of(new Cell(0, 2), new Cell(1, 2), new Cell(2, 2));

        // when
        boolean output = decider.isItVerticalWin(input);

        // then
        assertThat(output).isTrue();
    }
}