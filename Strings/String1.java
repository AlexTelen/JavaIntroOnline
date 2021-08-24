/**
 * 1. Дан текст (строка). Найдите наибольшее
 * количество подряд идущих пробелов в нем.
 */

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                count++;
                if (count > max)
                    max = count;
            } else
                count = 0;
        }
        System.out.println(max);
    }
}
