/**
 * 3. Проверить, является ли заданное слово палиндромом.
 */

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(isPalindrome(a));
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
            if (s.charAt(i) != s.charAt(j))
                return false;
        return true;
    }
}
