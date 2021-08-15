/**
 * 8. Даны два числа. Определить цифры,
 * входящие в запись как первого так и
 * второго числа.
 */


public class Cycle8
{
    public static void main(String[] args) {

        long a = Long.parseLong(args[0]);
        long b =  Long.parseLong(args[1]);

        char[] values = new char[10];
        char[] newa = String.valueOf(a).toCharArray();
        char[] newb = String.valueOf(b).toCharArray();

        for (int i = 0; i < newa.length; i++)
            for (int j = 0; j<newb.length; j++)
            {
                if (newa[i] == newb[j] )
                    for(int f = 0; f < 10 && newa[i] != values[f]; f++)
                    {
                        if (values[f] == Character.MIN_VALUE)
                        {
                            values[f] = newa[i];
                            break;
                        }
                    }
            }
        for(int f = 0; f < values.length; f++)
            System.out.print(values[f] + " ");
    }
}
