import java.util.*;

/**
 * 12. Даны натуральные числа К и N. Написать
 * метод(методы) формирования массива А,
 * элементами которого являются числа, сумма
 * цифр которых равна К и которые не большее N.
 */

public class Decomposition12 {
    private static int newValue(int k, int n) {
        Random rand = new Random();
        int sum = 0;
        String b = "";
        while (sum != k || Integer.parseInt(b) > n) {
            b = rand.nextInt(100) + "";
            sum = 0;
            for (int i = 0; i < b.length(); i++)
                sum += Character.getNumericValue(b.charAt(i));
        }
        return Integer.parseInt(b);
    }

    private static int[] newArray(int k, int n, int[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = newValue(k, n);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("K: ");
        int k = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.print("Size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println(Arrays.toString(newArray(k, n, a)));
    }
}
