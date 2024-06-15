// File: Main.java
package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        while (!rectangle.isLengthValid()) {
            try {
                double length = getInput("Enter the length of the rectangle: ");
                rectangle.setLength(length);
            } catch (RuntimeException e) {
                error(" - " + e.getMessage());
            }
        }
        while (!rectangle.isWidthValid()) {
            try {
                double width = getInput("Enter the width of the rectangle: ");
                rectangle.setWidth(width);
            } catch (RuntimeException e) {
                error(" - " + e.getMessage());
            }
        }

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    private static double getInput(String message) throws RuntimeException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(message);
        String input;

        try {
            input = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }

        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException | NullPointerException e) {
            throw new RuntimeException("Invalid input. Please enter a number.");
        }
    }

    private static void error(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m");
    }
}
