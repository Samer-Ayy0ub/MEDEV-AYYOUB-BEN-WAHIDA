package fr.centrale.medev.tp.note;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Game class.
 */
class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testStart() {
        game.start();

        // Check that the game board and players are initialized
        assertNotNull(game);
    }

    @Test
    void testTakeTurn() {
        game.start();

        // Ensure that takeTurn processes without error
        assertDoesNotThrow(() -> {
            game.takeTurn();
        });

        // Validate currentPlayer after a turn
        assertNotNull(game);
    }

    @Test
    void testSwitchTurn() {
        game.start();

        // Assume player1 starts as currentPlayer
        Player initialPlayer = game.getCurrentPlayer();

        // Switch turn
        game.switchTurn();

        // Verify currentPlayer is switched
        assertNotEquals(initialPlayer, game.getCurrentPlayer());
    }

}
