/**
 * 8. Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько,
 * не обрабатывать.
 */

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int place = 0;
        int maxLength = 0;
        int count = 1;
        for (int i = 0, j = 0; i < a.length(); i++) {
            if (i == a.length() - 1 || a.charAt(i + 1) == ' ') {
                if (i + 1 - j == maxLength) {
                    count++;
                }
                if (i + 1 - j > maxLength) {
                    maxLength = i + 1 - j;
                    place = j;
                    count = 1;
                }
                j = i + 2;
            }
        }
        if (count < 2)
            System.out.println(a.substring(place, place + maxLength));
    }
}
