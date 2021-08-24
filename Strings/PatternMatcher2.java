import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher2 {
    public static void main(String[] argv) throws Exception {

        String inputStr = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";

        xmlAnalyser(inputStr);
    }

    private static void xmlAnalyser(String inputStr) {
        Matcher openTag = Pattern.compile("<(\\w+)[^<>]*>").matcher(inputStr);
        while (openTag.find()) {
            String p = openTag.group(1);
            String[] text = Pattern.compile("</*" + p + "(/*>|\\s[^<>]+>)").split(inputStr, 3);
            Matcher closeTag = Pattern.compile("</" + p + ">").matcher(inputStr);
            if (closeTag.find())
                System.out.println(openTag.group(0) + ", " + closeTag.group(0) + ", " + text[1] + ", " + openTag.group(0) + closeTag.group(0));
            else
                System.out.println(openTag.group(0));
            System.out.println();

            if (text.length > 2)
                inputStr = text[1] + text[2];
        }

    }
}