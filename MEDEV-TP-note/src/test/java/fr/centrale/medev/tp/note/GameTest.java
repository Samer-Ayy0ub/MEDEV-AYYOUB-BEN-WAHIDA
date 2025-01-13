package fr.centrale.medev.tp.note;

import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
        System.setErr(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void testTakeTurn_ValidInput() {
        // Simulate user input for "d3"
        String simulatedInput = "d3\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Game game = new Game();
        game.takeTurn();

        // Capture the output and validate
        String output = outputStream.toString();
        assertTrue(output.contains("You entered: x = 3, y = 4"), "Valid input should result in correct x, y conversion.");
    }

    @Test
    void testTakeTurn_InvalidInputFollowedByValidInput() {
        // Simulate user input for invalid input "z9" followed by valid input "a1"
        String simulatedInput = "z9\na1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Game game = new Game();
        game.takeTurn();

        // Capture the output and validate
        String output = outputStream.toString();
        assertTrue(output.contains("Invalid input. Please enter a valid position"), "Invalid input should trigger an error message.");
        assertTrue(output.contains("You entered: x = 1, y = 1"), "Valid input after invalid input should result in correct x, y conversion.");
    }

    @Test
    void testTakeTurn_InputEdgeCases() {
        // Test edge cases for the input (e.g., minimum and maximum valid positions)
        String simulatedInput = "a1\nh8\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Game game = new Game();

        // First input
        game.takeTurn();
        String output = outputStream.toString();
        assertTrue(output.contains("You entered: x = 1, y = 1"), "Edge case 'a1' should result in x = 1, y = 1.");

        // Reset output stream for the next test
        outputStream.reset();

        // Second input
        game.takeTurn();
        output = outputStream.toString();
        assertTrue(output.contains("You entered: x = 8, y = 8"), "Edge case 'h8' should result in x = 8, y = 8.");
    }
}
