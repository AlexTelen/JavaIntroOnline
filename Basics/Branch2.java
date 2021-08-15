
/**
 * 2. Найти max { min(a, b), min(c, d) }.
 */


public class Branch2 {

    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[0]);
        int c=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[0]);

        int min1 = (a < b) ? a : b;
        int min2 = (c < d) ? c : d;
        int max = (min1>min2) ? min1 : min2;
        System.out.println(max);
    }
}