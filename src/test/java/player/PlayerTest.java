package player;

import board.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {
    Player player;

    @BeforeEach
    void init() {
        player = new Player();
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
}