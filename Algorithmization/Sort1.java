/**
 * 1. Заданы два одномерных массива с различным
 * количеством элементов и натуральное число k.
 * Объединить их в один массив, включив второй
 * массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 */

import java.util.*;

public class Sort1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr1 = new int[rand.nextInt(10) + 2];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = rand.nextInt(100);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[rand.nextInt(10) + 1];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = rand.nextInt(100);
        System.out.println(Arrays.toString(arr2));

        int k = rand.nextInt(arr1.length - 2) + 1;
        System.out.println("k=" + k);

        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int i = arr1.length - 1; i - arr2.length > k - 1; i--)
            arr1[i] = arr1[i - arr2.length];
        System.arraycopy(arr2, 0, arr1, k, arr2.length);

        System.out.println(Arrays.toString(arr1));

    }
}
