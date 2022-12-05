package org.example;

public class Task1 {

    public static int arrayToInt(int[] intArr){
        StringBuilder sb = new StringBuilder();

        for(int item: intArr){
            sb.append(item);
        }
        return Integer.parseInt(sb.toString());
    }
}
