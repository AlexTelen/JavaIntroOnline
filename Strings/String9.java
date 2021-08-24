/**
 * 9. Посчитать количество строчных (маленьких)
 * и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы.
 */

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());

        int countLowercase = 0;
        int countCapital = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i, i + 1).matches("[A-Z]"))
                countCapital++;
            if (a.substring(i, i + 1).matches("[a-z]"))
                countLowercase++;
        }
        System.out.println("Lowercase: " + countLowercase);
        System.out.println("Capitals: " + countCapital);
    }
}
