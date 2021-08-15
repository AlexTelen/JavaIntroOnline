
/**
 * 3. Вычислить значение выражения по формуле (все
 * переменные принимают действительные значения):
 * ( (sin x + cos y) / (cos x − sin y) ) * tg xy
 */

public class Line3 {

    public static void main(String[] args) {

        float x=Float.parseFloat(args[0]);
        float y=Float.parseFloat(args[1]);

        double z = ( (Math.sin(x) + Math.cos(y) ) /
                (Math.cos(x) - Math.sin(y) ) ) * Math.tan (x * y);

        System.out.println("( (sin x + cos y) / (cos x − sin y) ) * tg xy = " + z);
    }
}
