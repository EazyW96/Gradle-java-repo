package org.example.Chapter01.exercises;

/* (Compute expressions) Write a program that displays the result of:

        9.5 * 4.5 - 2.5 * 3
        ___________________
            45.5 - 3.5
*/

public class Exercise_01_05 {
    public static void main(String[] args) {
        // Problem Statement
        System.out.println("Problem: (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)");
        System.out.println("------------------------------------------------");

        // Step 1: Calculate numerator
        double numerator = (9.5 * 4.5) - (2.5 * 3);
        System.out.println("Numerator calculation: (9.5 * 4.5) - (2.5 * 3) = " + numerator);

        // Step 2: Calculate denominator
        double denominator = 45.5 - 3.5;
        System.out.println("Denominator calculation: 45.5 - 3.5 = " + denominator);

        // Step 3: Calculate final result
        double result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}
