package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Main method execution started...");
        Scanner reader = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n******************CalculatorX******************");
            System.out.println("Available Operations: ");
            System.out.print("[1] 'Square Root'" + "    ");
            System.out.print("[2] 'Factorial'" + "    ");
            System.out.print("[3] 'Natural Logarithm'" + "   ");
            System.out.print("[4] 'Power'" + "    ");
            System.out.print("[5] 'Logarithm Base 2'" + "    ");
            System.out.print("[6] 'Exit'");
            System.out.println();
            System.out.print("Enter your choice (number): ");
            op = reader.nextInt();

            if (op == 1) { // Square Root
                System.out.println("You have chosen Square Root.");
                System.out.println();
                System.out.print("Enter a number: ");
                double num = reader.nextDouble();
                System.out.println("The result is: " + calculateSquareRoot(num));
            } else if (op == 2) { // Factorial
                System.out.println("You have chosen Factorial.");
                System.out.println();
                System.out.print("Enter a number: ");
                int num = reader.nextInt();
                System.out.println("The result is: " + calculateFactorial(num));
            } else if (op == 3) { // Natural Logarithm
                System.out.println("You have chosen Natural Logarithm.");
                System.out.println();
                System.out.print("Enter a number: ");
                double num = reader.nextDouble();
                System.out.println("The result is: " + calculateNaturalLogarithm(num));
            } else if (op == 4) { // Power
                System.out.println("You have chosen Power.");
                System.out.println();
                System.out.print("Enter a base number: ");
                double num = reader.nextDouble();
                System.out.print("Enter an exponent: ");
                double exp = reader.nextDouble();
                System.out.println("The result is: " + calculatePowerFunction(num, exp));
            } else if (op == 5) { // Logarithm Base 2
                System.out.println("You have chosen Logarithm Base 2.");
                System.out.println();
                System.out.print("Enter a number: ");
                double num = reader.nextDouble();
                System.out.println("The result is: " + calculateLogBase2(num));
            } else if (op == 6) { // Exit
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (op != 6);
    }

    public static double calculateSquareRoot(double num) {
        double result = Math.sqrt(num);
        logger.info("Executing squareRoot function!");
        return result;
    }

    public static int calculateFactorial(int num) {
        int result = num;
        for (int i = num - 1; i >= 1; i--) result *= i;
        logger.info("Executing Factorial function!");
        return result;
    }

    public static double calculateNaturalLogarithm(double num) {
        double result = Math.log(num);
        logger.info("Executing naturalLog function!");
        return result;
    }

    public static double calculatePowerFunction(double num, double exp) {
        double result = Math.pow(num, exp);
        logger.info("Executing Power function!");
        return result;
    }

    public static double calculateLogBase2(double num) {
        double result = Math.log(num) / Math.log(2);
        logger.info("Executing Log base 2 function!");
        return result;
    }
}
