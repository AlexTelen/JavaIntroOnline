import java.util.Arrays;
import java.util.Scanner;

/**
 * 10. Дано натуральное число N. Написать
 * метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */

public class Decomposition10 {
    private static int[] toArray(int n) {
        String b = Integer.toString(n);
        int[] c = new int[b.length()];
        for (int i = 0; i < b.length(); i++)
            c[i] = Character.getNumericValue(b.charAt(i));
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(toArray(n)));
    }
}
