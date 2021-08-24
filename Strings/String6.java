/**
 * 6. Из заданной строки получить новую,
 * повторив каждый символ дважды.
 */

public class String6 {
    public static void main(String[] args) {
        String a = "java";
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < 2; j++)
                b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
