
/**
 * 1. Напишите программу, где пользователь
 * вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до
 * введенного пользователем числа.
 */


public class Cycle1 {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int sum = 0;

        if (x > 0)
            for (int i = 0; i < x; sum += i++) ;
        System.out.println(sum);
    }
}
