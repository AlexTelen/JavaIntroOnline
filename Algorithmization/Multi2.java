/**
 * 2. Дана квадратная матрица. Вывести на
 * экран элементы, стоящие на диагонали.
 */

import java.util.*;

public class Multi2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 2;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int i2 = 0; i2 < n; i2++) {
                a[i][i2] = rand.nextInt(100) - 50;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.println();
            for (int i2 = 0; i2 < n; i2++) {
                System.out.print(a[i][i2] + " ");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++)
            System.out.print(a[i][i] + " ");
        System.out.println("\n");
        for (int i = 0, j = n - 1; i < n && j > -1; i++, j--)
            System.out.print(a[i][j] + " ");
    }
}
