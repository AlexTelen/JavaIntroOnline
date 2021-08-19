import java.util.*;

/**
 * 8. Задан массив D. Определить следующие суммы:
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы
 * трех последовательно расположенных элементов массива с
 * номерами от k до m.
 */

public class Decomposition8 {
    private static int sum(int[] a, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++)
            sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(4) + 6;
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = rand.nextInt(100) - 50;
        System.out.println("D = " + Arrays.toString(array) + "\n");

        System.out.println("D[l] + D[2] + D[3] = " + sum(array, 1, 3));
        System.out.println("D[3] + D[4] + D[5] = " + sum(array, 3, 5));
        System.out.println("D[4] + D[5] + D[6] = " + sum(array, 4, 6));
    }
}
