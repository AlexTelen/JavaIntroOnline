/**
 * 8. В числовой матрице поменять местами два столбца любых
 * столбца, т. е. все элементы одного столбца поставить на
 * соответствующие им позиции другого, а его элементы второго
 * переместить в первый. Номера столбцов вводит пользователь
 * с клавиатуры.
 */

import java.util.*;

public class Multi8 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n1 = rand.nextInt(10);
        int n2 = rand.nextInt(10) + 2;
        int[][] a = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = rand.nextInt(100) - 50;
            }
        }

        for (int i = 0; i < n1; i++) {
            System.out.println();
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println("\n");
        int a1, a2;
        do {
            System.out.print("A1: ");
            a1 = sc.nextInt();
            System.out.print("A2: ");
            a2 = sc.nextInt();
        }
        while (a1 > n2 || a2 > n2);
        for (int j = 0; j < n1; j++) {
            int temp = a[j][a1 - 1];
            a[j][a1 - 1] = a[j][a2 - 1];
            a[j][a2 - 1] = temp;
        }

        for (int i = 0; i < n1; i++) {
            System.out.println("\n");
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}

