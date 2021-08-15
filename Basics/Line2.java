
/**
 * 2. Вычислить значение выражения по формуле (все переменные
 * принимают действительные значения):
 * ( (b + √( b^2 + 4ac) ) / 2a) − (a ^ 3) * c + b ^ (−2)
 */


public class Line2 {
    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        double z = (b + Math.sqrt (Math.pow (b,2) + 4 * a * c) )/ (2 * a)
                - Math.pow (a,3) * c + Math.pow (b,-2);

        System.out.println("( (b + √( b^2 + 4ac) ) / 2a) − (a ^ 3) * c + b ^ (−2) = " + z);
    }
}
