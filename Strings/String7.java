/**
 * 7. Вводится строка. Требуется удалить из
 * нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def",
 * то должно быть выведено "abcdef".
 */

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner sc = new Scanner(System.in);
        StringBuilder b = new StringBuilder();
        b.append(sc.nextLine());
        System.out.println(b);
        for (int i = 0; i < b.length(); i++) {
            if (b.substring(i, i + 1).equals(" ")) {
                b.delete(i, i + 1);
            }
            for (int j = i + 1; j < b.length(); j++) {
                if (b.substring(i, i + 1).equals(b.substring(j, j + 1))) {
                    b.delete(j, j + 1);
                }
            }
        }
        System.out.println(b);
    }
}
