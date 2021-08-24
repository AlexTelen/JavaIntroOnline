/**
 * 4. С помощью функции копирования и
 * операции конкатенации составить из
 * частей слова “информатика” слово “торт”.
 */

public class String4 {
    public static void main(String[] args) {
        String a = "информатика";
        String b = "";
        b = b.concat(a.substring(7, 8));
        b = b.concat(a.substring(3, 5));
        b = b.concat(a.substring(7, 8));
        System.out.println(b);
    }
}
