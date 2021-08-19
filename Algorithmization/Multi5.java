/**
 * 5. Сформировать квадратную матрицу порядка
 * n по заданному образцу(n - четное):
 */

import java.util.*;

public class Multi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("N: ");
            n = sc.nextInt();
        }
        while (n % 2 != 0);
        int[][] a = new int[n][n];
        int n2 = n;
        for (int i = 0; i < n; i++, n2--) {
            for (int i2 = 0; i2 < n2; i2++) {
                a[i2][i] = i2 + 1;
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
