package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    public static int secondHighestNumber(int[] intArray){
        Arrays.sort(intArray);
        int index = intArray.length -2;
        return intArray[index];
    }
}
