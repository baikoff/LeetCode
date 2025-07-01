package org.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerMapScanLeft {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;
            int curr = map.get(s.charAt(i));
            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("VII"));
        System.out.println(romanToInt("XVII"));
        System.out.println(romanToInt("XX"));
    }
}
