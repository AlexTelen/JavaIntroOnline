
/**
 * 4. Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

import java.util.*;


public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        float[] a = new float[n];
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(150) - 100 + rand.nextFloat();
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            if (a[i] > a[max])
                max = i;
            if (a[i] < a[min])
                min = i;
        }
        float temp = a[max];
        a[max] = a[min];
        a[min] = temp;
        System.out.println(Arrays.toString(a));

    }
}
