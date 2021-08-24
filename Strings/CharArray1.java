/**
 * 1. Дан массив названий переменных в camelCase.
 * Преобразовать названия в snake_case.
 */

public class CharArray1 {
    public static void main(String[] args) {
        char[][] a = {"javaEpam".toCharArray(), "jEpam".toCharArray(), "javaJunior".toCharArray(), "juniorEpam".toCharArray(), "trainingEpam".toCharArray()};
        for (char[] c : a) {
            c = convert(c);
            System.out.println(c);
        }
    }

    private static char[] convert(char[] a) {
        int size = a.length;
        for (char c : a)
            if (Character.isUpperCase(c))
                size++;
        char[] b = new char[size];
        b[0] = Character.toLowerCase(a[0]);
        for (int i = 1, j = 1; j < b.length; i++, j++) {
            if (Character.isLowerCase(a[i])) {
                b[j] = a[i];
            } else {
                b[j] = '_';
                b[j + 1] = Character.toLowerCase(a[i]);
                j++;
            }
        }
        return b;
    }
}
