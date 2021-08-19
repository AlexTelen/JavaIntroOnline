import java.util.Scanner;

/**
 * 9. Даны числа X, Y, Z, Т — длины сторон
 * четырехугольника. Написать метод(методы)
 * вычисления его площади, если угол между
 * сторонами длиной X и Y— прямой.
 */

public class Decomposition9 {
    private static int square(int x, int y, int z, int t) {
        return x * (y + t) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();
        System.out.print("Z: ");
        int z = scan.nextInt();
        System.out.print("T: ");
        int t = scan.nextInt();
        System.out.println("\n" + square(x, y, z, t));
    }
}
