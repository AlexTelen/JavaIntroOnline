/**
 * 5. Сортировка вставками. Дана последовательность
 * чисел. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом.
 * Берется следующее число и вставляется в
 * последовательность так, чтобы новая
 * последовательность была тоже возрастающей.
 * Процесс производится до тех пор, пока все
 * элементы от i +1 до n не будут перебраны.
 * Примечание. Место помещения очередного элемента
 * в отсортированную часть производить с помощью
 * двоичного поиска. Двоичный поиск оформить в виде
 * отдельной функции.
 */

import java.util.*;

public class Sort5 {
    public static void main(String[] args) {

        Random rand = new Random();
        int l = rand.nextInt(10) + 2;
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100) - 50;

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int n = BinarySearch(array, i);


            int temp = array[i];

            for (int j = i; j > n; j--)
                array[j] = array[j - 1];
            array[n] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    private static int BinarySearch(int[] a, int key) {
        int low = 0;
        int high = key;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (a[mid] < a[key])
                low = mid + 1;
            else if (a[mid] > a[key])
                high = mid - 1;
            if (low == mid)
                return mid;
            if (high == mid)
                return mid + 1;
        }
        return 0;
    }
}
