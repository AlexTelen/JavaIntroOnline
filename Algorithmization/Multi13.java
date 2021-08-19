/**
 * 13. Отсотрировать стобцы матрицы по
 * возрастанию и убыванию значений эементов.
 */

import java.util.Random;


public class Multi13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = rand.nextInt(10) + 2;
        int n2 = rand.nextInt(10) + 2;
        int[][] a = new int[n1][n2];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < n2; j++)
                a[i][j] = rand.nextInt(100) - 50;

        for (int i = 0; i < n1; i++) {
            System.out.println("\n");
            for (int j = 0; j < n2; j++)
                System.out.print(a[i][j] + " ");
        }

        for (int i = 0; i < n2; i++)
            for (int j = 0; j < n1; )
                if ((j + 1) < n1 && a[j][i] > a[j + 1][i]) {
                    int temp = a[j][i];
                    a[j][i] = a[j + 1][i];
                    a[j + 1][i] = temp;
                    j = 0;
                } else
                    j++;

        System.out.println("\n\nSort ascending: ");

        for (int i = 0; i < n1; i++) {
            System.out.println("\n");
            for (int j = 0; j < n2; j++)
                System.out.print(a[i][j] + " ");
        }

        for (int i = 0; i < n2; i++)
            for (int j = 0; j < n1; )
                if ((j + 1) < n1 && a[j][i] < a[j + 1][i]) {
                    int temp = a[j][i];
                    a[j][i] = a[j + 1][i];
                    a[j + 1][i] = temp;
                    j = 0;
                } else
                    j++;

        System.out.println("\n\nSort descending: ");

        for (int i = 0; i < n1; i++) {
            System.out.println("\n");
            for (int j = 0; j < n2; j++)
                System.out.print(a[i][j] + " ");
        }
    }
}
