import java.util.Scanner;

/**
 * 3. Вычислить площадь правильного
 * шестиугольника со стороной а,
 * используя метод вычисления площади
 * треугольника.
 */
public class Decomposition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        double a = sc.nextInt();
        System.out.println("Square:" + square(a) * 6);

    }

    private static double square(double a) {
        return a * a / 2 * Math.sqrt(3) / 2;
    }
}
