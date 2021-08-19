/**
 * 11. Матрицу 10x20 заполнить случайными числами
 * от 0 до 15. Вывести на экран саму матрицу и
 * номера строк, в которых число 5 встречается
 * три и более раз.
 */

import java.util.*;

public class Multi11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] a = new int[10][20];
        int[] count = new int[10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 20; j++) {
                a[i][j] = rand.nextInt(15);
                if (a[i][j] == 5)
                    count[i]++;
            }

        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
            for (int j = 0; j < 20; j++)
                System.out.print(a[i][j] + " ");
        }

        System.out.print("\n\nRows with number 5 is 3 times or more: ");

        for (int i = 0; i < 10; i++)
            if (count[i] >= 3)
                System.out.print((i + 1) + " ");

    }
}
