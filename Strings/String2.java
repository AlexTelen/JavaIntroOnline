/**
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class String2 {
    public static void main(String[] args) {
        String a = "Java is a programming language and computing platform first released by Sun Microsystems in 1995.";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                a = a.substring(0, i + 1) + 'b' + a.substring(i + 1);
            }
        }
        System.out.println(a);
    }
}
