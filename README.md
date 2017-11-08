# royal-game-of-ur

A very simple implementation of the Royal Game of Ur (https://en.wikipedia.org/wiki/Royal_Game_of_Ur)

## How to run the server

`mvn clean package && java -jar target/royal-game-of-ur-0.0.1-SNAPSHOT.jar`

To start a new game:</br>
`GET http://localhost:8080/new-game`

To get the game-state:</br>
`GET http://localhost:8080/game`

To get the board-state:</br>
`GET http://localhost:8080/board`

To roll the 'dice':</br>
`GET http://localhost:8080/roll`

To move a specific game piece:</br>
`POST http://localhost:8080/move/{gamePieceId}`

To move a random game piece:</br>
`GET http://localhost:8080/move`

To make the game play itself out by rolling and moving random game pieces until one player has won:</br>
`GET http://localhost:8080/play`

## How to create AIs and make em do battle

Create a class that implements `se.stromvap.royal.game.of.ur.ai.Ai`.

Go to `se.stromvap.royal.game.of.ur.ai.AiArenaMain` and use your new AI against another AI.

Currently the `SimpleAi` has a win rate of 95% vs `RandomAi`.

Good luck!

## TODO
TODO: Make someone look at the code and improve it!</br>
TODO: Create UI