import java.util.Scanner;

/**
 * 1. Написать метод(методы) для нахождения
 * наибольшего общего делителя и наименьшего
 * общего кратного двух натуральных чисел
 */

public class Decomposition1 {
    private static int gcd(int a, int b) {
        int max;
        int com = 1;
        max = Math.max(a, b);
        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                com *= i;
                a /= i;
                b /= i;
                i = 1;
            }
        }
        return com;
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.println("Greatest common divisor: " + gcd(a, b));
        System.out.println("Least common multiple: " + lcm(a, b));
    }
}
