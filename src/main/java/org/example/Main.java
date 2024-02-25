package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting the Calculator...");

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            printMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayResult("Square Root", calculateSquareRoot(scanner));
                    break;
                case 2:
                    displayResult("Factorial", calculateFactorial(scanner));
                    break;
                case 3:
                    displayResult("Natural Logarithm", calculateNaturalLog(scanner));
                    break;
                case 4:
                    displayResult("Power", calculatePower(scanner));
                    break;
                case 5:
                    displayResult("Logarithm Base 2", calculateLogBase2(scanner));
                    break;
                case 6:
                    logger.info("Exiting...");
                    isRunning = false;
                    break;
                default:
                    logger.warn("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        logger.info("******************CalculatorX******************");
        logger.info("Available Operations:");
        logger.info("1. Square Root");
        logger.info("2. Factorial");
        logger.info("3. Natural Logarithm");
        logger.info("4. Power");
        logger.info("5. Logarithm Base 2");
        logger.info("6. Exit");
        logger.info("Enter your choice (number): ");
    }

    private static double calculateSquareRoot(Scanner scanner) {
        logger.info("Enter a number: ");
        double num = scanner.nextDouble();
        double result = Math.sqrt(num);
        logger.info("Square Root of {} is {}", num, result);
        return result;
    }

    private static int calculateFactorial(Scanner scanner) {
        logger.info("Enter a number: ");
        int num = scanner.nextInt();
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        logger.info("Factorial of {} is {}", num, result);
        return result;
    }

    private static double calculateNaturalLog(Scanner scanner) {
        logger.info("Enter a number: ");
        double num = scanner.nextDouble();
        double result = Math.log(num);
        logger.info("Natural Logarithm of {} is {}", num, result);
        return result;
    }

    private static double calculatePower(Scanner scanner) {
        logger.info("Enter a base number: ");
        double base = scanner.nextDouble();
        logger.info("Enter an exponent: ");
        double exp = scanner.nextDouble();
        double result = Math.pow(base, exp);
        logger.info("{} raised to the power of {} is {}", base, exp, result);
        return result;
    }

    private static double calculateLogBase2(Scanner scanner) {
        logger.info("Enter a number: ");
        double num = scanner.nextDouble();
        double result = Math.log(num) / Math.log(2);
        logger.info("Logarithm Base 2 of {} is {}", num, result);
        return result;
    }

    private static void displayResult(String operation, double result) {
        System.out.println("Result of " + operation + ": " + result);
    }

    private static void displayResult(String operation, int result) {
        System.out.println("Result of " + operation + ": " + result);
    }
}