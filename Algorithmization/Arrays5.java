/**
 * 5. Даны целые числа а1 ,а2 ,..., аn .
 * Вывести на печать только те числа,
 * для которых аi > i.
 */

import java.util.*;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(n * n);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            if (a[i] > i + 1)
                System.out.print(a[i] + " ");
        }
    }
}
