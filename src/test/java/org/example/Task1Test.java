package org.example;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void arrayToInt() {
        int[] in = new int[]{4,7,9,3};
        int result = Task1.arrayToInt(in);
        
        assertEquals(4793, result);
    }

    @org.junit.jupiter.api.Test
    void arrayToInt_leadingZeros() {
        int[] in = new int[]{0,0,7,9,3};
        int result = Task1.arrayToInt(in);
        // cannot have leading 0s for int in Java
        assertEquals(Integer.parseInt("00793"), result);
    }
}