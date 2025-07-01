package org.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerMapScanRight {
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
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));//1,1,5
            if (curr < prev) {//1<0,1<1,5<1
                result -= curr;
            } else {
                result += curr;//1+0=1,1+1=2,5+2=7
            }
            prev = curr;//1,1,5
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
