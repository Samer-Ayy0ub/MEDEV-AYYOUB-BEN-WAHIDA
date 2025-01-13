package fr.centrale.medev.tp.note;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Board class.
 */
class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board(); // Initialize a new board before each test
    }

    @Test
    void testInitializeBoard() {
        // Verify initial placement of pieces
        assertEquals('B', board.grid[3][3].getState());
        assertEquals('B', board.grid[4][4].getState());
        assertEquals('N', board.grid[3][4].getState());
        assertEquals('N', board.grid[4][3].getState());

        // Ensure all other cells are empty
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!((i == 3 || i == 4) && (j == 3 || j == 4))) {
                    assertEquals(' ', board.grid[i][j].getState());
                }
            }
        }
    }

    @Test
    void testIsValidMove() {
        // Valid move for black
        assertTrue(board.isValidMove(2, 3, 'N'));

        // Valid move for white
        assertTrue(board.isValidMove(2, 4, 'B'));

        // Invalid move (out of bounds)
        assertFalse(board.isValidMove(-1, 0, 'N'));
        assertFalse(board.isValidMove(8, 8, 'B'));

        // Invalid move (cell already occupied)
        assertFalse(board.isValidMove(3, 3, 'N'));
    }

    @Test
    void testMakeMove() {
        // Make a valid move
        board.makeMove(2, 3, 'N');

        // Verify the move was made
        assertEquals('N', board.grid[2][3].getState());

        // Verify opponent's piece was captured
        assertEquals('N', board.grid[3][3].getState());
    }

    @Test
    void testMakeMoveInvalid() {
        // Attempt to make an invalid move
        assertThrows(IllegalArgumentException.class, () -> board.makeMove(3, 3, 'N'));
    }

    @Test
    void testCountPieces() {
        // Verify initial count of pieces
        assertEquals(2, board.countPieces('B'));
        assertEquals(2, board.countPieces('N'));

        // Make a move and verify updated counts
        board.makeMove(2, 3, 'N');
        assertEquals(3, board.countPieces('N'));
        assertEquals(1, board.countPieces('B'));
    }

    @Test
    void testCheckForPossibleMoves() {
        // Verify possible moves for both players at the start
        assertTrue(board.checkForPossibleMoves('N'));
        assertTrue(board.checkForPossibleMoves('B'));

        // Simulate a board state with no possible moves for black
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board.grid[i][j].setState('B');
            }
        }

        assertFalse(board.checkForPossibleMoves('N'));
        assertTrue(board.checkForPossibleMoves('B'));
    }
}
