package org.example.Chapter01;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeExpressionTest {

    @Test
    void testComputeExpressionOutput() {
        // Redirect console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        ComputeExpression.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Normalize and capture output
        String actualOutput = outContent.toString().trim().replace("\r", "");

        // Expected output
        String expectedOutput = "(10.5 + 2 * 3) / (45 - 3.5) = 0.39759036144578314";

        // Assert the output matches
        assertEquals(expectedOutput, actualOutput, "Output should match the computed expression");
    }
}
