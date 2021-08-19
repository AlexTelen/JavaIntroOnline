/**
 * 6. Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

import java.util.*;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        float[] a = new float[n];
        float sum = 0;
        boolean simple = true;
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextFloat() + rand.nextInt(100) - 50;
            for (int j = 1; j < i; j++) {
                if ((i + 1) % j == 0 && j != 1 && j != i + 1)
                    simple = false;
            }
            if (simple)
                sum += a[i];
            simple = true;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
    }
}