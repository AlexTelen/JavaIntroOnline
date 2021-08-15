
/**
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 *       x, x > 2
 * y = {
 *      -x, x <= 2
 */


public class Cycle2
{
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);

        while (a <= b) {

            if (a > 2)
                System.out.print(a+' ');
            else
                System.out.println((-a)+' ');
            a += h;
        }
    }
}