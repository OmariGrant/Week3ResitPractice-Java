package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    @DisplayName("Given 6 letters return 6")
    void letterCount() {
        String input = "fgjyij";
        int result = Task2.letterCount(input);

        assertEquals(6, result);
    }

    @Test
    @DisplayName("Given 12 letters return 12 and ignore space")
    void letterCount_withSpace() {
        String input = "fgjyij fgjyij";
        int result = Task2.letterCount(input);

        assertEquals(12, result);
    }
    @Test
    @DisplayName("Given 10 letters return 10 and ignore space & special characters")
    void letterCount_withSpaceAndSpecialCharacters() {
        String input = "f!g+j y&i Pgyi j.";
        int result = Task2.letterCount(input);

        assertEquals(10, result);
    }
}