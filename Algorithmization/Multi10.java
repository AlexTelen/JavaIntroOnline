/**
 * 10. Найти положительные элементы главной
 * диагонали квадратной матрицы.
 */

import java.util.Random;


public class Multi10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 2;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(100) - 50;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

        System.out.print("\n\nPositive numbers: ");

        for (int i = 0; i < n; i++) {
            if (a[i][i] > 0)
                System.out.print(a[i][i] + " ");
        }
    }
}
