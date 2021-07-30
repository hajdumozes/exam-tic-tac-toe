## Components

### Board:

scenario: board printing

✅ case 1: board print should return with:

| | -+-+- | | -+-+- | |

scenario: board gives empty spaces

✅ case 1: empty spaces should be part of it

✅ case 2: O-s should not be part of it

✅ case 3: X-s should not be part of it

### Player:

scenario: player picks a move

✅ case 1: player picks the only cell, if the input is only one cell

✅ case 2: player picks a cell from input cells

case 3: picked cell should be occupied by player

### Game manager

scenario: player rounds

✅ case 1: starting player should be X

✅ case 2: play rounds should switch player

case 3: play round should invoke player's pick a cell effect

case 4: round switch should print the board after 2 second

case 5: if game is over, there shouldn't be a round switch

case 6: play round should trigger all game over decider checks with current player cells (except for draw, which is
empty cells)

scenario: board state should trigger game over

case 1: none of them are present, no game over, new round

case 2: game over winner or draw should be printed

### Game over

scenario player won with vertical line

✅ case 1: 1|1 & 1|2 & 1|3 is occupied by the same player

✅ case 2: 2|1 & 2|2 & 2|3 is occupied by the same player

✅ case 3: 3|1 & 3|2 & 3|3 is occupied by the same player

✅ case 4: any other, no win with vertical

-> game over, have a winner

scenario player won with horizontal line case 1:

✅ 1|1 & 2|1 & 3|1 is occupied by the same player

✅ case 2: 1|2 & 2|2 & 3|3 is occupied by the same player

✅ case 3: 1|3 & 2|3 & 3|3 is occupied by the same player

✅ case 4: any other, no win with horizontal

-> game over, have a winner

scenario player won with diagonal line

✅ case 1: 1|1 & 2|2 & 3|3 is occupied by the same player

✅ case 2: 1|3 & 2|2 & 3|1 is occupied by the same player

✅ case 4: any other, no win with diagonal -> game over, have a winner

scenario: draw

✅ case 1: there are empty spaces -> false

✅ case 2: no empty space -> true

pomodoro 1:

- ✅ make notes
- ✅ create board class
- ✅ have board print

pomodoro 2:

- ✅ board gives back empty spaces
- ✅ player can pick a space on board from empty ones
- ✅ game manager creates board
- game maganer decides rounds
- game should lasts until there is game over

pomodoro 3:

- specify win conditions and game overs
    - ✅ horizontal
    - ✅ vertical
    - ✅ diagonal
    - ✅ draw

pomodoro 4:

- update notes for future pomodoros
- update techdebt