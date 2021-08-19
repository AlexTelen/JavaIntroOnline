import java.util.Arrays;
import java.util.Random;

/**
 * 5. Составить программу, которая в массиве A[N]
 * находит второе по величине число (вывести на
 * печать число, которое меньше максимального
 * элемента массива, но больше всех других элементов).
 */

public class Decomposition5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 2;
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = rand.nextInt(100) - 50;
        System.out.println(Arrays.toString(array));
        System.out.println(findMax(array));
    }

    private static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int max2 = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < max && a[i] > max2)
                max2 = a[i];
        }
        return max2;
    }
}
