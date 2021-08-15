
/**
 * 7. Для каждого натурального числа в промежутке
 * от m до n вывести все делители, кроме единицы
 * и самого числа. m и n вводятся с клавиатуры.
 */


public class Cycle7
{
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        if (m > 0 && n > 0)
        {
            for (int i = m; i <= n; i++)
            {
                System.out.print("\n" + i + ": ");

                for (int j = 1; j < i; j++)

                    if (i % j == 0 && j != 1)
                        System.out.print(" "+j);
            }
        }
    }
}
