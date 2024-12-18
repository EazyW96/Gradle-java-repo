package org.example.Chapter01.exercises;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise_01_01Test {

    @Test
    void testDisplayMessages() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the program
        Exercise_01_01.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "Welcome to Java\nWelcome to Computer Science\nProgramming is fun";
        String actualOutput = outContent.toString().trim().replace("\r", "");
        assertEquals(expectedOutput, actualOutput, "The output should match the expected result");
    }
}
