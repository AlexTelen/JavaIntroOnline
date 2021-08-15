
/**
 * 5. Даны числовой ряд и некоторое число е. Найти
 * сумму тех членов ряда, модуль которых больше
 * или равен заданному е. Общий член ряда имеет
 * вид: a(n) = (1 / 2^n) + (1 / 3^n)
 */


public class Cycle5
{
    public static void main(String[] args) {

        System.out.print("Number of values: ");
        int count = Integer.parseInt(args[0]);
        int e = Integer.parseInt(args[1]);

        double sum = 0;
        double[] a=new double[count];

        for (int n = 0; n <count; n++){
            a[n]=1 / Math.pow(2,n) + 1 / Math.pow(3,n);
            if (Math.abs(a[n]) >= e){
                sum += a[n];
            }
        }
        System.out.print("Sum: " + sum);
    }
}
