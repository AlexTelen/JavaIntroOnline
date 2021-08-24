/**
 * 5. Подсчитать, сколько раз среди
 * символов заданной строки встречается
 * буква “а”.
 */

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a')
                count++;
        }
        System.out.println(count);
    }
}