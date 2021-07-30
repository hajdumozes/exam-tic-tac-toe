package game;

import board.GameBoard;
import board.Occupier;
import lombok.Getter;
import player.Player;

import java.util.List;

@Getter
public class GameManager {
    GameBoard gameBoard = new GameBoard();
    List<Player> players = List.of(new Player(Occupier.PLAYER_X), new Player(Occupier.PLAYER_O));
    Player currentPlayer = players.get(0);
    boolean isGameOver = false;

    public void playRound() {
        if (currentPlayer.equals(players.get(0))) {
            currentPlayer = players.get(1);
        } else {
            currentPlayer = players.get(0);
        }
    }
}
