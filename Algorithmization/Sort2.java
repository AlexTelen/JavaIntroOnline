/**
 * 2. Даны две последовательности. Образовать из них
 * новую последовательность чисел так, чтобы она тоже
 * была неубывающей. Примечание. Дополнительный массив
 * не использовать.
 */

import java.util.*;

public class Sort2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(10) + 2;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100) - 50;
            if (i != 0)
                while (a[i] < a[i - 1])
                    a[i] = rand.nextInt(100) - 50;
        }
        System.out.println(Arrays.toString(a));

        int m = rand.nextInt(10) + 2;
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = rand.nextInt(100) - 50;
            if (i != 0)
                while (b[i] < b[i - 1])
                    b[i] = rand.nextInt(100) - 50;
        }
        System.out.println(Arrays.toString(b));

        a = Arrays.copyOf(a, n + m);
        System.arraycopy(b, 0, a, n, m);

        for (int i = 0; i < a.length - 1; )
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i = 0;
            } else
                i++;

        System.out.println(Arrays.toString(a));
    }
}
