import java.util.Scanner;

/**
 * 14. Натуральное число, в записи которого n
 * цифр, называется числом Армстронга, если сумма
 * его цифр, возведенная в степень n, равна самому
 * числу. Найти все числа Армстронга от 1 до k. Для
 * решения задачи использовать декомпозицию.
 */

public class Decomposition14 {
    private static void find(int k) {
        for (int i = 1; i <= k; i++) {
            if (Math.pow(sum(i), Integer.toString(i).length()) == i)
                System.out.println(i);
        }
    }

    private static int sum(int a) {
        int sum = 0;
        String b = Integer.toString(a);
        for (int i = 0; i < b.length(); i++)
            sum += Character.getNumericValue(b.charAt(i));
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("K: ");
        int k = sc.nextInt();
        find(k);
    }
}
