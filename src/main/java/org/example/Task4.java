package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Task4 {

//    public static String[] duplicateLetters(String input){
////        String[] result = new String[]{};
//        HashMap<String, Integer> temp = new HashMap<>();
//        ArrayList<String> results = new ArrayList<>();
//
//        for (int i = 0; i < input.length(); i++) {
//            String character = Character.toString(input.charAt(i));
//            try {
//                temp.put(character, temp.get(character) + 1);
//            } catch (NullPointerException e){
//                temp.put(character, 0);
//            }
//
//
//            for (int j = 0; j < temp.values().size(); j++) {
//                if(temp.get(j) >= 1){
//                    results.add(temp.k)
//                }
//            }
//        }
//
//    }

    public static String[] countDuplicateLetters(String input){
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if(Character.toString(input.charAt(i))
                        .equalsIgnoreCase(Character.toString(input.charAt(j)))
                        && i != j && Character.toString(input.charAt(i)).matches("[A-Za-z]+")
                ){
                    result.add(Character.toString(input.charAt(i)).toUpperCase());

                }
            }
        }
        HashSet<String> set = new HashSet<String>(result);
        result.clear();
        result.addAll(set);
        System.out.println(result);
        String[] result1 = result.toArray(new String[result.size()]);

        return result1;
    }

}
