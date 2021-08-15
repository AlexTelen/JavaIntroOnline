
/**
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */


public class Line4 {

    public static void main(String[] args) {

        float r=Float.parseFloat(args[0]);

        float r2 = (int) ( (r - (int)r) * 1000)  // Перевод дробной части в целую
                + (float)  (int) r / 1000; // Перевод целой части в дробную

        System.out.println("Reversed: "+r2);
    }
}
