/**
 * 9. В массиве целых чисел с количеством элементов n найти
 * наиболее часто встречающееся число. Если таких чисел
 * несколько, то определить наименьшее из них.
 */

import java.util.*;

public class Arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Arrays.fill(b, 1);
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100) - 50;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j])
                    ++b[i];
            }
            if (b[i] > b[max])
                max = i;
        }


        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (b[i] == b[max])
                System.out.print(a[i] + " ");
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == b[max] && a[i] < a[max]) {
                max = i;
            }
        }
        System.out.println("\nMin: " + a[max]);
    }
}
