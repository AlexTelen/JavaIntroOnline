/**
 * 15. Найдите наибольший элемент матрицы
 * и заменить все нечетные элементы на него.
 */

import java.util.Random;

public class Multi15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = rand.nextInt(10) + 2;
        int n = rand.nextInt(10) + 2;
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = rand.nextInt(100) - 50;

        for (int i = 0; i < m; i++) {
            System.out.println("\n");
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
        }

        int max = a[0][0];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] > max)
                    max = a[i][j];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] % 2 != 0)
                    a[i][j] = max;

        System.out.println("\nResult:");
        for (int i = 0; i < m; i++) {
            System.out.println("\n");
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
        }
    }
}
