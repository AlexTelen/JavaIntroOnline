/**
 * 4. Сортировка обменами. Дана
 * последовательность чисел.Требуется
 * переставить числа в порядке возрастания.
 * Для этого сравниваются два соседних числа.
 * Если > , то делается перестановка. Так
 * продолжается до тех пор, пока все элементы
 * не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая
 * при этом количества перестановок.
 */

import java.util.*;

public class Sort4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 2;
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = rand.nextInt(100);

        System.out.println(Arrays.toString(arr1));
        int count = 0;
        for (int i = 0; i < n - 1; )
            if (arr1[i] > arr1[i + 1]) {
                int temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
                i = 0;
                count++;
            } else
                i++;
        System.out.println(Arrays.toString(arr1) + "\nShifts:" + count);
    }

}
