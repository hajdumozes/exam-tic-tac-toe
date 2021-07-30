package game;

import board.GameBoard;
import board.Occupier;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import player.Player;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GameManager {
    final GameBoard gameBoard = new GameBoard();
    final List<Player> players = List.of(new Player(Occupier.PLAYER_X), new Player(Occupier.PLAYER_O));
    Player currentPlayer = players.get(0);
    boolean isGameOver = false;

    public void playGame() {
        while (!isGameOver) {
            playRound();
        }
    }

    public void playRound() {
        currentPlayer.pickCell(gameBoard.getEmptyCells());
        if (currentPlayer.equals(players.get(0))) {
            currentPlayer = players.get(1);
        } else {
            currentPlayer = players.get(0);
        }
    }
}
