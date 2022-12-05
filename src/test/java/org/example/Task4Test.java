package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void countDuplicateLetters() {
        String input = "AABBCCDEF";
        String[] expected = {"A", "B", "C"};
        String[] result = Task4.countDuplicateLetters(input);

        assertArrayEquals(expected, result);

    }
    @Test
    void countDuplicateLetters_caseSensitive() {
        String input = "AaBbCcDEFAaabbBBBcccCCC";
        String[] expected = {"A", "B", "C"};
        String[] result = Task4.countDuplicateLetters(input);

        assertArrayEquals(expected, result);

    }

    @Test
    void countDuplicateLetters_onlyLetters() {
        String input = "AaBbCc08978&&DEFAaabbBBBcccCCC!!!..????";
        String[] expected = {"A", "B", "C"};
        String[] result = Task4.countDuplicateLetters(input);

        assertArrayEquals(expected, result);

    }
}