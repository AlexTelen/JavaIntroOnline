import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher1 {
    public static void main(String[] argv) {

        String inputStr = "Two roads diverged in a yellow wood,\n" +
                "And sorry I could not travel both\n" +
                "And be one traveler, long I stood\n" +
                "And looked down one as far as I could\n" +
                "To where it bent in the undergrowth.";

        //System.out.println(sortParagraphs(inputStr));
        //sortWords(inputStr);
        sortSymbols(inputStr, 'a');
    }

    private static String sortParagraphs(String inputStr) {
        String[] paragraphs = Pattern.compile("(?m)(\\r\\n)").split(inputStr);
        int[] count = new int[paragraphs.length];
        System.out.println(Arrays.toString(paragraphs));
        for (int j = 0; j < paragraphs.length; j++) {
            for (int i = 0; i < paragraphs[j].length(); i++) {
                if (paragraphs[j].substring(i, i + 1).matches("[!?.]")) {
                    count[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        for (int j = 0; j < paragraphs.length - 1; j++) {
            if (count[j] > count[j + 1]) {
                String str = paragraphs[j];
                paragraphs[j] = paragraphs[j + 1];
                paragraphs[j + 1] = str;
                j = 0;
            }
        }
        StringBuilder newString = new StringBuilder();
        for (String n : paragraphs) {
            newString.append(n + "\r\n");
        }
        return newString.toString();
    }

    private static void sortWords(String inputStr) {
        String[] sentences = Pattern.compile("[?!.]\\s*").split(inputStr);

        for (String st1 : sentences)
            System.out.println(st1);

        String[][] words = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++)
            words[i] = sentences[i].split("\\b,*\\s");
        for (int i = 0; i < sentences.length; i++)
            for (int j = 0; j < words[i].length - 1; )
                if (words[i][j].length() > words[i][j + 1].length()) {
                    String str = words[i][j + 1];
                    words[i][j + 1] = words[i][j];
                    words[i][j] = str;
                    j = 0;
                } else
                    j++;
        for (String[] st : words)
            System.out.println(Arrays.toString(st));
    }

    private static void sortSymbols(String inputStr, char symbol) {
        String[] sentences = Pattern.compile("[?!.]\\s*").split(inputStr);
        String[][] words = new String[sentences.length][];
        int[] count;
        for (int i = 0; i < sentences.length; i++)
            words[i] = sentences[i].split("\\b,*\\s");
        for (int i = 0; i < sentences.length; i++) {
            count = new int[words[i].length];
            for (int j = 0; j < words[i].length; j++) {
                Pattern p = Pattern.compile(String.valueOf(symbol));
                Matcher m = p.matcher(words[i][j]);
                while (m.find()) {
                    count[j]++;
                }
            }
            for (int j = 0; j < count.length - 1; ) {
                if (count[j] < count[j + 1]) {
                    String str = words[i][j + 1];
                    words[i][j + 1] = words[i][j];
                    words[i][j] = str;
                    int c = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = c;
                    j = 0;
                } else j++;
            }

            for (int j = 0; j < count.length - 1; j++) {
                if (count[j] == count[j + 1]) {
                    if (words[i][j].compareToIgnoreCase(words[i][j + 1]) > 0) {
                        String str = words[i][j + 1];
                        words[i][j + 1] = words[i][j];
                        words[i][j] = str;
                        j = 0;
                    }
                }
            }
        }
        for (String[] st : words)
            System.out.println(Arrays.toString(st));
    }
}
