/**
 * 6. Сортировка Шелла. Дан массив n действительных
 * чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два
 * соседних элемента. Если <= , то продвигаются
 * на один элемент вперед. Если > , то производится
 * перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */

import java.util.*;


public class Sort6 {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(10) + 2;
        float[] array = new float[n];
        for (int i = 0; i < n; i++)
            array[i] = rand.nextFloat() + rand.nextInt(100) - 50;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < n - 1; )
            if (array[i] <= array[i + 1])
                i++;
            else {
                float temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0)
                    i--;
            }
        System.out.println(Arrays.toString(array));
    }
}
