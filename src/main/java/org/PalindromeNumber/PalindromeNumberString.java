package org.PalindromeNumber;

public class PalindromeNumberString {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
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
