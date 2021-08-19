import java.util.Arrays;
import java.util.Scanner;

/**
 * 17. Из заданного числа вычли сумму его цифр.
 * Из результата вновь вычли сумму его цифр (?)
 * и т.д. Сколько таких действий надо произвести,
 * чтобы получился нуль? Для решения задачи
 * использовать декомпозицию.
 */

public class Decomposition17 {
    private static int sum(int a) {
        int sum = 0;
        String b = Integer.toString(a);
        for (int i = 0; i < b.length(); i++)
            sum += Character.getNumericValue(b.charAt(i));
        return sum;
    }

    private static int count(int a) {
        int count = 0;
        while (a > 0) {
            a = decrease(a);
            count++;
        }
        return count;
    }

    private static int decrease(int a) {
        return a - sum(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.println(count(a));
    }
}