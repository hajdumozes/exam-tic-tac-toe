package player;

import board.Cell;
import board.Occupier;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Random;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Player {
    Occupier occupier;

    public Cell pickCell(List<Cell> availableCells) {
        int randomIndex = new Random().nextInt(availableCells.size());
        return availableCells.get(randomIndex);
    }
}
