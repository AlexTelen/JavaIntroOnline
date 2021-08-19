/**
 * 7. Написать метод(методы) для вычисления
 * суммы факториалов всех нечетных чисел
 * от 1 до 9.
 */

public class Decomposition7 {
    private static int sum() {
        int sum = 0;
        for (int i = 1; i <= 9; i++)
            if (i % 2 != 0) {
                int factorial = 1;
                for (int j = 1; j <= i; j++)
                    factorial *= j;
                sum += factorial;
            }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
