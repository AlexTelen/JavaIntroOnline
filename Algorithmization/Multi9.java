/**
 * 9. Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит
 * максимальную сумму.
 */

import java.util.Random;

public class Multi9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = rand.nextInt(10) + 2;
        int n2 = rand.nextInt(10) + 2;
        int[][] a = new int[n1][n2];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < n2; j++)
                a[i][j] = rand.nextInt(100);

        for (int i = 0; i < n1; i++) {
            System.out.println("\n");
            for (int j = 0; j < n2; j++)
                System.out.print(a[i][j] + " ");
        }

        int[] sum = new int[n2];
        int max = 0;

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++)
                sum[i] += a[j][i];
            if (max < sum[i])
                max = sum[i];
        }

        System.out.print("\n\nSum: ");

        for (int i = 0; i < n2; i++)
            System.out.print(sum[i] + " ");
        System.out.println("\nMax: " + max);
    }
}
