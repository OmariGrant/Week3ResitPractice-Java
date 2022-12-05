package org.example;

public class Task2 {
    public static int letterCount(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).matches("[A-Za-z]+")){
                count++;
            }
        }
        return count;
    }
}
