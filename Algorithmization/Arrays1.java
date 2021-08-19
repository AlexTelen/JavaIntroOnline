
/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

import java.util.*;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("K: ");
        int k = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0)
                sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
    }
}