/**
 * 13. Два простых числа называются «близнецами»,
 * если они отличаются друг от друга на 2 (например,
 * 41 и 43). Найти и напечатать все пары «близнецов»
 * из отрезка [n,2n], где n - заданное натуральное
 * число больше 2. Для решения задачи использовать
 * декомпозицию.
 */

public class Decomposition13 {
    private static void find(int n) {
        if (n > 2)
            for (int i = n; i + 2 <= 2 * n; i++)
                System.out.println(i + " " + (i + 2));
        else
            System.out.println("n should be larger than 2");
    }

    public static void main(String[] args) {
        find(12);
    }
}
