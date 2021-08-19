/**
 * 8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
 * Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(а1 ,а2 ,..., аn).
 */

import java.util.*;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100) - 50;
        }
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }
        int n2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != min)
                n2++;
        }
        int[] b = new int[n2];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] != min) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
