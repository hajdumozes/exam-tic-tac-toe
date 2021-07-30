package game;

import board.PlayerSymbol;
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
        PlayerSymbol expected = PlayerSymbol.PLAYER_X;

        // when
        Player output = gameManager.getCurrentPlayer();

        // then
        Assertions.assertThat(output.getPlayerSymbol()).isEqualTo(expected);
    }

    @Test
    void playRound_shouldChangePlayers() {
        // given
        PlayerSymbol expected = PlayerSymbol.PLAYER_O;

        // when
        gameManager.playRound();

        // then
        Assertions.assertThat(gameManager.getCurrentPlayer().getPlayerSymbol()).isEqualTo(expected);
    }
}