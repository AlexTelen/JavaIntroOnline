/**
 * 3. В строке найти количество цифр.
 */

public class CharArray3 {
    public static void main(String[] args) {
        char[] a = "epam1java2training3.".toCharArray();
        int count = 0;
        for (char c : a) {
            if (Character.isDigit(c))
                count++;
        }
        System.out.println(count);
    }
}
