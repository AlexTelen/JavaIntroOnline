
/**
 * 4. Заданы размеры А, В прямоугольного отверстия
 * и размеры х, у, z кирпича. Определить, пройдет
 * ли кирпич через отверстие.
 */


public class Branch4 {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);
        int y = Integer.parseInt(args[3]);
        int z = Integer.parseInt(args[4]);

        if (x * y <= a * b || y * z <= a * b || x * z <= a * b)
            System.out.println("Fits");
        else
            System.out.println("Doesn't fit");
    }
}
