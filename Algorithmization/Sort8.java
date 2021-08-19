/**
 * 8.Даны дроби ( p , q - натуральные). Составить
 * программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */

import java.util.*;

public class Sort8 {
    public static void main(String[] args) {

        Random rand = new Random();

        int n = rand.nextInt(10) + 2;
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = rand.nextInt(10) + 1;
        }

        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = rand.nextInt(10) + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " / " + q[i] + '\t');
        }


        int c = q[0];
        for (int i = 0; i < n - 1; i++) {
            c = common(c, q[i + 1]);
        }

        System.out.print("\nCommon divider: ");
        for (int i = 0; i < n; i++) {
            p[i] = p[i] * (c / q[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " / " + c + '\t');
        }

        for (int i = 0; i < n - 1; )
            if (p[i] <= p[i + 1])
                i++;
            else {
                int temp = p[i];
                p[i] = p[i + 1];
                p[i + 1] = temp;
                if (i > 0)
                    i--;
            }

        System.out.print("\nSorted: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " / " + c + '\t');
        }
    }

    private static int common(int a, int b) {
        int max;
        int com = 1;
        if (a > b)
            max = a;
        else
            max = b;
        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                com *= i;
                a /= i;
                b /= i;
                i = 1;
            }
        }
        com = com * a * b;
        return com;
    }
}
