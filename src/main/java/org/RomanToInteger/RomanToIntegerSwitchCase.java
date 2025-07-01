package org.RomanToInteger;

public class RomanToIntegerSwitchCase {
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            int next = (i + 1 < s.length()) ? value(s.charAt(i + 1)) : 0;
            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }

    private static int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
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
