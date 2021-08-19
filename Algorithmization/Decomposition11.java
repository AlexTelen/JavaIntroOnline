import java.util.Scanner;

/**
 * 11. Написать метод(методы), определяющий,
 * в каком из данных двух чисел больше цифр.
 */

public class Decomposition11 {
    private static int moreNumbers(int a, int b) {
        if (Integer.toString(a).length() > Integer.toString(b).length())
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.println(moreNumbers(a, b) + " has more numbers");
    }
}
