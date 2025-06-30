package org.PalindromeNumber;

public class PalindromeNumberReverse {

    public static boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;
        if (x < 0) {
            return false;
        }

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return reversed == original;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123)); // false
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(1231)); // false
        System.out.println(isPalindrome(1234)); // false
        System.out.println(isPalindrome(12321)); // true
        System.out.println(isPalindrome(-121)); // false
    }
}
