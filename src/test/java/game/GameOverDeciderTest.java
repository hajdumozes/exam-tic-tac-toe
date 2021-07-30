package game;

import board.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

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
}