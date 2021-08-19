/**
 * 16. Магическим квадратом порядка n называется
 * квадратная матрица размера nxn, составленная
 * из чисел 1, 2, 3, ..., 2 n так, что суммы по
 * каждому столбцу, каждой строке и каждой из
 * двух больших диагоналей равны между собой.
 * Построить такой квадрат. Пример магического
 * квадрата порядка 3:
 * 6 1 8
 * 7 5 3
 * 2 9 4
 */

import java.util.Scanner;

public class Multi16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("n: ");
            n = sc.nextInt();
        }
        while (n % 2 == 0);
        int[][] a = new int[n][n];
        int i = n / 2;
        int j = n - 1;

        for (int f = 1; f <= n * n; f++) {
            if (i == -1)
                if (j == n) {
                    i = 0;
                    j = n - 2;
                } else
                    i = n - 1;
            else {
                if (j == -1)
                    j = n - 1;
                if (i == n)
                    i = 0;
                if (j == n)
                    j = 0;
            }
            if (a[i][j] != 0) {
                j -= 2;
                ++i;
            }

            a[i][j] = f;
            i--;
            j++;

        }

        for (int k = 0; k < n; k++) {
            System.out.println("\n");
            for (int l = 0; l < n; l++) {
                System.out.print(a[k][l] + " ");
            }
        }
    }
}
