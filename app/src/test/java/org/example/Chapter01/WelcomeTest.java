package org.example.Chapter01;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeTest {

    @Test
    void testWelcomeOutput() {
        // Redirect console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        Welcome.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Normalize the output
        String actualOutput = outContent.toString().trim().replace("\r", "");

        // Assert that the output matches "Welcome to Java!"
        assertEquals("Welcome to Java!", actualOutput, "Output should match 'Welcome to Java!'");
    }
}
