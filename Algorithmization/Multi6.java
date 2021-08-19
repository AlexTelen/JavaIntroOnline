/**
 * 6. Сформировать квадратную матрицу порядка
 * n по заданному образцу(n - четное):
 * 1 1 1 ... 1 1 1
 * 0 1 1 ... 1 1 0
 * 0 0 1 ... 1 0 0
 * : : : `*. : : :
 * 0 1 1 ... 1 1 0
 * 1 1 1 ... 1 1 1
 */

import java.util.Scanner;

public class Multi6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("N: ");
            n = sc.nextInt();
        }
        while (n % 2 != 0);
        int[][] a = new int[n][n];
        for (int i = 0, i2; i < n; i++)
            if (i < n - i)
                for (i2 = i; i2 < n - i; i2++)
                    a[i][i2] = 1;
            else
                for (i2 = i; i2 > n - i - 2; i2--)
                    a[i][i2] = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

    }
}
