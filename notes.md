##Components

### Board:

scenario: board printing
✅ case 1: board print should return with:

 | |
-+-+-
 | |
-+-+-
 | |

scenario: board gives empty spaces
case 1: empty spaces should be part of it

case 2: O-s should not be part of it

case 3: X-s shoud not be part of it

### Player:

scenario: player picks a move

case 1: player picks an empty space on board, their symbol should appear on it

case 2: player picks a non-empty space on board, exception thrown


### Game manager


scenario: player rounds

case 1: starting player should be X

case 2: upon player picks a space, the rounds should be given to the other player

case 3: round switch should print the board after 2 second

case 4: if game is over, there shouldn't be a round switch


scenario: board state should trigger game over
case 1: non of them are present, no game over

case 2: horizontal win, have a winner

case 3: vertical win, have a winner

case 4: diagonal win, have a winner

### Game over

scenario player won with vertical line

case 1: 1|1 & 1|2 & 1|3 is occupied by the same player

case 2: 2|1 & 2|2 & 2|3 is occupied by the same player

case 3: 3|1 & 3|2 & 3|3 is occupied by the same player

case 4: any other, no win with vertical

-> game over, have a winner

scenario player won with horizontal line
case 1: 1|1 & 2|1 & 3|1 is occupied by the same player

case 2: 1|2 & 2|2 & 3|3 is occupied by the same player

case 3: 1|3 & 2|3 & 3|3 is occupied by the same player

case 4: any other, no win with horizontal

-> game over, have a winner

scenario player won with diagonal line
case 1: 1|1 & 2|2 & 3|3 is occupied by the same player

case 2: 1|3 & 2|2 & 3|1 is occupied by the same player

case 4: any other, no win with diagonal
-> game over, have a winner

scenario: draw
case 1: no empty space -> game over, no winner

pomodoro 1:
- make notes
- create board class
- have board print