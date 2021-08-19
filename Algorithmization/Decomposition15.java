import java.util.Scanner;

/**
 * 15. Найти все натуральные n-значные числа,
 * цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.
 */

public class Decomposition15 {
    private static void find(int n) {
        int a = (int) Math.pow(10, n - 1);
        for (int i = a; i < a * 10; i++)
            if (isValid(i))
                System.out.println(i);
    }

    private static boolean isValid(int a) {
        String b = Integer.toString(a);
        for (int i = 1; i < b.length(); i++)
            if (Character.getNumericValue(b.charAt(i)) <= Character.getNumericValue(b.charAt(i - 1)))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        find(n);
    }
}
