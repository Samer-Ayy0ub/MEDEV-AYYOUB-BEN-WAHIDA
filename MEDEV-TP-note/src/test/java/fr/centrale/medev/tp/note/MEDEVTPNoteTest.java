package fr.centrale.medev.tp.note;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the MEDEVTPNote class.
 */
class MEDEVTPNoteTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testGameLoop() {
        game.start();

        // Mocking a simple game loop
        while (!game.checkWinner()) {
            assertDoesNotThrow(() -> {
                game.takeTurn();
                game.switchTurn();
            });
        }

        // Verify that the game ends correctly
        assertTrue(game.checkWinner());
    }

}
