package controllers;

import exceptions.DuplicateSymbolException;
import exceptions.InvalidMoveException;
import models.Game;
import models.GameState;
import models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) throws DuplicateSymbolException {
        // TODO
        // Validate if 2 players have the same symbol or not ?
        // If 2 players have same symbol, throw some exception.
        for (int i = 0; i < players.size(); i++) {
            Player player1 = players.get(i);
            for (int j = i + 1; j < players.size(); j++) {
                Player player2 = players.get(j);
                if (player1.getSymbol().equals(player2.getSymbol())) throw new DuplicateSymbolException("Duplicate player symbols found");
            }
        }

        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}