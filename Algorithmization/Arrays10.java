/**
 * 10. Дан целочисленный массив с количеством элементов п. Сжать
 * массив, выбросив из него каждый второй элемент (освободившиеся
 * элементы заполнить нулями). Примечание. Дополнительный массив
 * не использовать.
 */

import java.util.*;

public class Arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100) - 50;
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if ((i + 1) % 2 == 0)
                a[i] = 0;

        }
        System.out.println(Arrays.toString(a));
    }
}
