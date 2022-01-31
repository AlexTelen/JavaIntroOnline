import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {


    public static String readString() throws IOException {
        String stringIn = "";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        stringIn = bufferedReader.readLine();

        return stringIn;
    }

    public static int readInteger() {
        int pointMenu = 0;

        String stringIn = null;
        try {
            stringIn = readString();
            pointMenu = Integer.parseInt(stringIn);
        } catch (Exception e) {
            pointMenu = 0;
        }

        return pointMenu;
    }

    public static void print(String str) {
        System.out.println(str);
    }
}

