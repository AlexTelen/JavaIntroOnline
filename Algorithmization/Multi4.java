/**
 * 4. Сформировать квадратную матрицу порядка
 * n по заданному образцу(n - четное):
 */

import java.util.*;

public class Multi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("N: ");
            n = sc.nextInt();
        }
        while (n % 2 != 0);
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0)
                for (int i2 = 0; i2 < n; i2++) {
                    a[i][i2] = i2 + 1;
                }
            else
                for (int i2 = 0; i2 < n; i2++) {
                    a[i][i2] = n - i2;
                }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int i2 = 0; i2 < n; i2++) {
                System.out.print(a[i][i2] + " ");
            }
        }

    }
}
