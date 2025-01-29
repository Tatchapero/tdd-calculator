package org.example.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Add two integers")
    public void test1() {
        // Arrange
        int expected = 12;

        // Act
        int actual = calculator.add(4, 8);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtract two integers")
    public void test2() {
        // Arrange
        int expected = -4;

        // Act
        int actual = calculator.subtract(4, 8);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiply two integers")
    public void test3() {
        // Arrange
        int expected = 32;

        // Act
        int actual = calculator.multiply(4, 8);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Divide two integers")
    public void test4() {
        // Arrange
        double expected = 0.5;

        // Act
        double actual = calculator.divide(4, 8);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Add three string numbers")
    public void test5() {
        // Arrange
        int expected = 6;

        // Act
        int actual = calculator.add("1,2,3");

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Add array items")
    public void test6() {
        // Arrange
        int expected = 6;

        // Act
        int actual = calculator.add(new int[] { 1, 2, 3 });

        // Assert
        assertEquals(expected, actual);
    }
}