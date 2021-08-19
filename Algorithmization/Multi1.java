/**
 * 1. Дана матрица. Вывести на экран все нечетные
 * столбцы, у которых первый элемент больше последнего.
 */

import java.util.*;


public class Multi1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = rand.nextInt(10) + 2;
        int n2 = rand.nextInt(10) + 2;
        int[][] a = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int i2 = 0; i2 < n2; i2++) {
                a[i][i2] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < n1; i++) {
            System.out.print("\n");
            for (int i2 = 0; i2 < n2; i2++) {
                System.out.print(a[i][i2] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < n1; i++) {
            System.out.print("\n");
            for (int i2 = 0; i2 < n2; i2++) {
                if ((i2 + 1) % 2 != 0 && a[0][i2] > a[n1 - 1][i2])
                    System.out.print(a[i][i2] + " ");
            }
        }
    }
}