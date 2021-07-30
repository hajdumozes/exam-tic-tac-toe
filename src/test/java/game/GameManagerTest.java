package game;

import board.Occupier;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.Player;

class GameManagerTest {
    GameManager gameManager;

    @BeforeEach
    void init() {
        gameManager = new GameManager();
    }

    @Test
    void givenGameManagerCreation_getCurrentPlayer_startingPlayerShouldBePlayerX() {
        // given
        Occupier expected = Occupier.PLAYER_X;

        // when
        Player output = gameManager.getCurrentPlayer();

        // then
        Assertions.assertThat(output.getOccupier()).isEqualTo(expected);
    }
}