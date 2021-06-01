package main.java.Training;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++){
            if (i > 0 && charMap.get(s.charAt(i)) > charMap.get(s.charAt(i-1))) {
                result = result + charMap.get(s.charAt((i))) - (2 * charMap.get(s.charAt(i-1)));
            }
            else {
                result = result + charMap.get(s.charAt(i));
            }
        }

        return result;
    }
}

/*String s = "DCLXVI";
int result = RomanToInteger.convertRomanToInteger(s);
System.out.println(result);*/
