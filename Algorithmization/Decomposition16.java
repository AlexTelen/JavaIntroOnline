import java.util.Scanner;

/**
 * 16. Написать программу, определяющую сумму
 * n - значных чисел, содержащих только
 * нечетные цифры. Определить также, сколько
 * четных цифр в найденной сумме. Для решения
 * задачи использовать декомпозицию.
 */

public class Decomposition16 {
    private static int find(int n) {
        int a = (int) Math.pow(10, n - 1);
        int sum = 0;
        for (int i = a; i < a * 10; i++)
            if (isValid(i))
                sum += i;
        return sum;
    }

    private static boolean isValid(int a) {
        String b = Integer.toString(a);
        for (int i = 0; i < b.length(); i++)
            if (Character.getNumericValue(b.charAt(i)) % 2 == 0)
                return false;
        return true;
    }

    private static int evenNumber(int a) {
        String b = Integer.toString(a);
        int count = 0;
        for (int i = 0; i < b.length(); i++)
            if (Character.getNumericValue(b.charAt(i)) % 2 == 0)
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        int sum = find(n);
        System.out.println("Sum: " + sum);
        System.out.println("Number of even digits: " + evenNumber(sum));
    }
}