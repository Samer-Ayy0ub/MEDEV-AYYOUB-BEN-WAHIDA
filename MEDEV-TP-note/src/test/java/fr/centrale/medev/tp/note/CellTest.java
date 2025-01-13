package fr.centrale.medev.tp.note;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Cell class.
 */
class CellTest {

    @Test
    void testConstructorAndGetters() {
        // Create a Cell instance
        Cell cell = new Cell(3, 4);

        // Verify the position
        assertEquals(3, cell.getX());
        assertEquals(4, cell.getY());

        // Verify the default state
        assertEquals(' ', cell.getState());
    }

    @Test
    void testSetState() {
        // Create a Cell instance
        Cell cell = new Cell(3, 4);

        // Set the state to 'N'
        cell.setState('N');

        // Verify the state
        assertEquals('N', cell.getState());

        // Change the state to 'B'
        cell.setState('B');

        // Verify the new state
        assertEquals('B', cell.getState());
    }

    @Test
    void testToString() {
        // Create a Cell instance
        Cell cell = new Cell(3, 4);

        // Verify default string representation
        assertEquals(" ", cell.toString());

        // Set the state to 'N'
        cell.setState('N');

        // Verify string representation
        assertEquals("N", cell.toString());

        // Change the state to 'B'
        cell.setState('B');

        // Verify updated string representation
        assertEquals("B", cell.toString());
    }
}
