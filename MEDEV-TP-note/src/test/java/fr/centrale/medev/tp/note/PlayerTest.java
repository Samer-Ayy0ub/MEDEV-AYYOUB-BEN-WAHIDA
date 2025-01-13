package fr.centrale.medev.tp.note;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Player class.
 */
class PlayerTest {

    private Player player;
    private Board board;

    @BeforeEach
    void setUp() {
        player = new Player("Player1", 'N');
        board = new Board();
    }

    @Test
    void testPlayerConstructorAndGetters() {
        // Verify player name and color
        assertEquals("Player1", player.getName());
        assertEquals('N', player.getColor());
    }

    @Test
    void testSetName() {
        player.setName("NewName");
        assertEquals("NewName", player.getName());
    }

    @Test
    void testSetColor() {
        player.setColor('B');
        assertEquals('B', player.getColor());
    }

    @Test
    void testPlayValidMove() {
        // Simulate a valid move by the player
        int x = 2;
        int y = 3;
        board.makeMove(x, y, player.getColor());
        
        // Verify the board state after the move
        assertEquals('N', board.grid[x][y].getState());
    }

    @Test
    void testPlayInvalidMove() {
        // Attempt an invalid move and verify it throws an exception
        assertThrows(IllegalArgumentException.class, () -> {
            player.play(3, 3, board); // 3,3 already occupied in initial board
        });
    }
}
