/**
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */

import java.util.Arrays;

public class CharArray2 {
    public static void main(String[] args) {
        char[] a = "Замените в строке все вхождения word на letter.".toCharArray();
        char[] find = "word".toCharArray();
        char[] replace = "letter".toCharArray();

        System.out.println(convert(a, find, replace));
    }

    private static char[] convert(char[] a, char[] find, char[] replace) {

        int size = a.length;
        int[] place = new int[a.length / find.length];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (Arrays.equals(find, Arrays.copyOfRange(a, i, i + find.length))) {
                size += (replace.length - find.length + 1);
                place[j] = i;
                j++;

            }
        }

        char[] b = new char[size];

        for (int i = 0, j = 0, l = 0; i < a.length; i++, l++) {
            if (i != place[j])
                b[l] = a[i];
            else {
                for (int k = 0; k < replace.length; k++, l++) {
                    b[l] = replace[k];
                }
                i += find.length - 1;
                j++;
            }
        }
        return b;
    }
}
