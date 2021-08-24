/**
 * 5. Удалить в строке все лишние пробелы,
 * то есть серии подряд идущих пробелов
 * заменить на одиночные пробелы. Крайние
 * пробелы в строке удалить.
 */

public class CharArray5 {
    public static void main(String[] args) {
        char[] a = "   Удалить   в   строке   все     лишние пробелы.  ".toCharArray();
        a = convert(a);
        System.out.println(a);

    }

    private static char[] convert(char[] a) {
        char[] b = new char[a.length];
        int i = 0;
        while (Character.isSpaceChar(a[i]))
            i++;
        for (int j = 0; i < a.length; i++) {
            if (i == a.length - 1 & a[i] == ' ')
                break;
            if (!Character.isSpaceChar(a[i]) || !Character.isSpaceChar(a[i + 1])) {
                b[j] = a[i];
                j++;
            }
        }
        return b;
    }
}