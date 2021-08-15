
/**
 * 5. Вычислить значение функции:
 *
 *          x^2 - 3x + 9, если x <= 3
 * F(x) = {
 *          1 / (x^3 + 6), если x > 3
 */


public class Branch5 {

    public static void main(String[] args) {

        int x=Integer.parseInt(args[0]);

        if (x <= 3)
            System.out.println(Math.pow(x,2) - 3 * x + 9); //если x <= 3
        else
            System.out.println(1 / (Math.pow(x,3) + 6) ); //если x > 3
    }
}
