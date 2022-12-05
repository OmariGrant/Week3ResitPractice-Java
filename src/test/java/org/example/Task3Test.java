package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void secondHighestNumber() {
        int[] input = new int[]{0,24,2,6,135,726,92,12,5,-4,-55,-11123};
        int expected = 135;
        int result = Task3.secondHighestNumber(input);
        assertEquals(expected, result);

    }
}