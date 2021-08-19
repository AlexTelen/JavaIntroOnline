/**
 * 12. Отсортировать строки матрицы по возрастанию
 * и убыванию значений элементов.
 */

import java.util.*;


public class Multi12 {
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

        for (int i = 0; i < n1; i++)
            for (int j = 0; j < n2; )
                if ((j + 1) < n2 && a[i][j] > a[i][j + 1]) {
                    int temp = a[i][j];
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = temp;
                    j = 0;
                } else
                    j++;

        System.out.println("\n\nSort ascending: ");

        for (int i = 0; i < n1; i++) {
            System.out.println("\n");
            for (int j = 0; j < n2; j++)
                System.out.print(a[i][j] + " ");
        }

        for (int i = 0; i < n1; i++)
            for (int j = 0; j < n2; )
                if ((j + 1) < n2 && a[i][j] < a[i][j + 1]) {
                    int temp = a[i][j];
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = temp;
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
