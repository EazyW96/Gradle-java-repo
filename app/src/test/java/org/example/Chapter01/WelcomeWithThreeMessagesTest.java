package org.example.Chapter01;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeWithThreeMessagesTest {

    @Test
    void testWelcomeWithThreeMessagesOutput() {
        // Redirect console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        WelcomeWithThreeMessages.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Normalize output
        String actualOutput = outContent.toString().trim().replace("\r", "");

        // Expected output
        String expectedOutput = """
            Programming is fun!
            Fundamentals First
            Problem Driven
            """.trim();

        // Assert that the output matches
        assertEquals(expectedOutput, actualOutput, "Output should match the expected three messages");
    }
}
