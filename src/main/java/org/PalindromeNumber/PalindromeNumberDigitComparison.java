package org.PalindromeNumber;

public class PalindromeNumberDigitComparison {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int div = 1;
        // Находим делитель, чтобы извлечь старшую цифру
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int left = x / div;      // старшая цифра
            int right = x % 10;      // младшая цифра

            if (left != right) return false;

            // Убираем сравненную цифру с начала и конца
            x = (x % div) / 10;
            div /= 100;  // уменьшаем делитель на два разряда
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
