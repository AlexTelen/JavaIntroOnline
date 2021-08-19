
/**
 * 3. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и
 * нулевых элементов.
 */

import java.util.*;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        float[] a = new float[n];
        int negative = 0;
        int positive = 0;
        int zeroes = 0;
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextFloat() + rand.nextInt(150) - 100;
            if (a[i] < 0)
                negative++;
            else if (a[i] > 0)
                positive++;
            else
                zeroes++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Negative: " + negative + ". Positive: " + positive + ". Zeroes: " + zeroes);
    }
}
