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


        // Act
        calculator.add(4, 8);

        // Assert
    }

    @Test
    @DisplayName("Subtract two integers")
    public void test2() {
        // Arrange

        // Act
        calculator.subtract(4, 8);

        // Assert
    }

    @Test
    @DisplayName("Multiply two integers")
    public void test3() {
        // Arrange

        // Act
        calculator.multiply(4, 8);

        // Assert
    }

    @Test
    @DisplayName("Divide two integers")
    public void test4() {
        // Arrange

        // Act
        calculator.divide(4, 8);

        // Assert
    }
}