/**
 * 3. Сортировка выбором. Дана последовательность чисел.
 * Требуется переставить элементы так, чтобы они были
 * расположены по убыванию. Для этого в массиве,
 * начиная с первого, выбирается наибольший элемент и
 * ставится на первое место, а первый - на место
 * наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

import java.util.*;

public class Sort3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 2;
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = rand.nextInt(100);

        System.out.println(Arrays.toString(arr1));
        int max = 0;
        for (int j = 0; j < arr1.length; ) {
            for (int i = j; i < arr1.length; i++)
                if (arr1[i] > arr1[max])
                    max = i;
            int temp = arr1[max];
            arr1[max] = arr1[j];
            arr1[j] = temp;
            j++;
            max = j;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
