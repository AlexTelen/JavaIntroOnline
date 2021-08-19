import java.util.Scanner;

/**
 * 2. Написать метод(методы) для нахождения
 * наибольшего общего делителя четырех
 * натуральных чисел.
 */

public class Decomposition2 {
    private static int gcd(int a, int b, int c, int d) {
        int max = a;
        int com = 1;
        if (b > max)
            max = b;
        else if (c > max)
            max = c;
        else if (d > max)
            max = d;

        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                com *= i;
                a /= i;
                b /= i;
                c /= i;
                d /= i;
                i = 1;
            }
        }
        return com;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.print("C: ");
        int c = scan.nextInt();
        System.out.print("D: ");
        int d = scan.nextInt();
        System.out.println("Greatest common divisor: " + gcd(a, b, c, d));
    }
}
