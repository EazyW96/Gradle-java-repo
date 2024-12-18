package org.example.Chapter02;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeAreaTest {

    @Test
    void testComputeAreaOutput() {
        // Redirect console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        ComputeArea.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Normalize output
        String actualOutput = outContent.toString().trim().replace("\r", "");

        // Expected output
        String expectedOutput = "The area for the circle of radius 20.0 is 1256.636";

        // Assert that the output matches
        assertEquals(expectedOutput, actualOutput, "Output should match the computed area for radius 20");
    }
}
