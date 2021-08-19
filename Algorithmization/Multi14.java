/**
 * 14. Сформировать случайную матрицу m x n,
 * состоящую из нулей и единиц, причем в
 * каждом столбце число единиц равно номеру
 * столбца.
 */

import java.util.*;

public class Multi14 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int m, n;
        do {
            System.out.print("m: ");
            m = sc.nextInt();
            System.out.print("n: ");
            n = sc.nextInt();
        }
        while (m < n);
        int[][] a = new int[m][n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; ) {
                a[j][i] = rand.nextInt(2);
                if (a[j][i] == 1)
                    count[i]++;
                if ((j + 1) == m && count[i] != i + 1) {
                    j = 0;
                    count[i] = 0;
                } else
                    j++;
            }

        for (int i = 0; i < m; i++) {
            System.out.println("\n");
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
        }
    }
}
