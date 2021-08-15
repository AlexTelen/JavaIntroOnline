
/**
 * 1. Найдите значение функции:
 * z = ( (a – 3 ) * b / 2) + c.
 */


public class Line1 {

    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int z = ( (a - 3) * b / 2) + c;

        System.out.println ("z = " + z);
    }

}
