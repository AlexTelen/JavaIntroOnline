
/**
 * 4. Составить программу нахождения произведения
 * квадратов первых двухсот чисел.
 */


public class Cycle4
{
    public static void main(String[] args) {

        int mul = 1;

        for (int i = 1; i <= 200; i++)
            mul *= Math.pow(i,2);

        System.out.println(mul);
    }
}/* Output:
2147483647
*///:~
