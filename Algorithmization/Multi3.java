/**
 * 3. Дана матрица. Вывести k-ю строку
 * и p-й столбец матрицы.
 */

import java.util.*;


public class Multi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n1 = rand.nextInt(10) + 1;
        int n2 = rand.nextInt(10) + 1;
        int[][] a = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int i2 = 0; i2 < n2; i2++) {
                a[i][i2] = rand.nextInt(100) - 50;
            }
        }

        for (int i = 0; i < n1; i++) {
            System.out.print("\n");
            for (int i2 = 0; i2 < n2; i2++) {
                System.out.print(a[i][i2] + " ");
            }
        }

        int k, p;
        do {
            System.out.print("\nk: ");
            k = sc.nextInt();
            System.out.print("p: ");
            p = sc.nextInt();
        }
        while (k > n1 || p > n2);

        for (int i = 0; i < n2; i++) {
            System.out.print(a[k - 1][i] + " ");
        }

        for (int i = 0; i < n1; i++) {
            System.out.print("\n" + a[i][p - 1]);
        }

    }
}
