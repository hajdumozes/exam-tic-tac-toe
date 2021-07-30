package player;

import board.Cell;
import board.Occupier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {
    Player player;

    @BeforeEach
    void init() {
        player = new Player(Occupier.PLAYER_X);
    }

    @Test
    void givenOneCellPresent_pickCell_shouldReturnIt() {
        // given
        Cell cell = new Cell(0, 0);
        List<Cell> input = List.of(cell);

        // when
        Cell output = player.pickCell(input);

        // then
        assertThat(output).isEqualTo(cell);
    }

    @Test
    void givenMultipleCellArePresent_pickCell_shouldReturnOneOfThem() {
        // given
        Cell cell = new Cell(0, 0);
        Cell otherCell = new Cell(1, 1);
        List<Cell> input = List.of(cell, otherCell);

        // when
        Cell output = player.pickCell(input);

        // then
        assertThat(input.contains(output)).isTrue();
    }
}