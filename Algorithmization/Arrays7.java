/**
 * 7. Даны действительные числа а1 ,а2 ,..., аn.
 * Найти max(a1+a2n, a2+a2n-1 , ... , an+an+1 )
 */

import java.util.*;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        float[] a = new float[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextFloat() + rand.nextInt(100) - 50;
        }
        float max = a[0] + a[n - 1];
        float sum;

        for (int i = 0; i < n; i++, n--) {
            sum = a[i] + a[n - 1];
            if (sum > max)
                max = sum;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(max);
    }
}
