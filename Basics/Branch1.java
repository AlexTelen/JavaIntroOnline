
/**
 * 1. Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */


public class Branch1 {
    public static void main(String[] args) {

        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);

        // Существует ли треугольник?

        if (a1 + a2 >= 180)
            System.out.print("Doesn't exist. ");
        else {
            System.out.print("Exists. ");

            // Прямоугольный ли он?
            if (a1 == 90 || a2 == 90 || a1 + a2 == 90)
                System.out.println("It's rectangular.");
            else
                System.out.println("It's not rectangular.");
        }
    }
}
