
/**
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

import java.util.*;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Z: ");
        float z = sc.nextFloat();
        System.out.print("N: ");
        int n = sc.nextInt();
        float[] a = new float[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextFloat()+rand.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));

        System.out.println("\nReplacements: " + count);
    }
}
