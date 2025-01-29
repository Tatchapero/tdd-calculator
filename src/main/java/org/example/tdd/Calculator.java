package org.example.tdd;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }

    public int add(String numbers) {
        int result = 0;

        for (String number : numbers.split(",")) {
            try {
                result += Integer.parseInt(number);
            }
            catch(Exception e) {
                System.out.println("Could not parse '" + number + "' to an integer.");
            }
        }

        return result;
    }

    public int add(int[] numbers) {
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        return result;
    }
}
