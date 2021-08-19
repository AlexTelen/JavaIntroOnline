/**
 * 7. Пусть даны две неубывающие последовательности
 * действительных чисел a и b. Требуется указать те
 * места, на которые нужно вставлять элементы b в
 * первую последовательность так, чтобы новая
 * последовательность оставалась возрастающей.
 */

import java.util.*;

public class Sort7 {
    public static void main(String[] args) {

        Random rand = new Random();

        int n = rand.nextInt(10) + 2;
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextFloat() + rand.nextInt(100) - 50;
            if (i != 0)
                while (a[i] < a[i - 1])
                    a[i] = rand.nextInt(100) - 50 + rand.nextFloat();

        }
        System.out.println(Arrays.toString(a));

        int m = rand.nextInt(10) + 2;
        float[] b = new float[m];
        for (int i = 0; i < m; i++) {
            b[i] = rand.nextFloat() + rand.nextInt(100) - 50;
            if (i != 0)
                while (b[i] < b[i - 1])
                    b[i] = rand.nextInt(100) - 50 + rand.nextFloat();

        }
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if ((j == 0 || a[j] <= b[i]) && (a[j + 1] >= b[i] || j == n))
                    System.out.print(j + 1 + " ");
    }
}
