# Task

## Task 1

```java
    public static int arrayToInt(int[] intArr){
        StringBuilder sb = new StringBuilder();

        for(int item: intArr){
            sb.append(item);
        }
        return Integer.parseInt(sb.toString());
    }
```

append each integer as a string, then convert to integer

## Task 2

```java
    public static int letterCount(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).matches("[A-Za-z]+")){
                count++;
            }
        }
        return count;
    }
```

Count only letters in a string

## Task 3

```java
    public static int secondHighestNumber(int[] intArray){
        Arrays.sort(intArray);
        int index = intArray.length -2;
        return intArray[index];
    }
```

sort the array into ascending order, then return the 2nd to last item

## Task 4

```java
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
```

Add character to arraylist if characters are the same, irregardless of the case, so long as its a letter. 

Store all results in uppercase to remove duplicates when using the hashset.

The hashset will remove all duplicates, before being recreated into the arrayList that is returned as a array of Strings
