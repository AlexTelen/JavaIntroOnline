
/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 */


public class Branch3 {

    public static void main(String[] args) {

        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        int x3 = Integer.parseInt(args[4]);
        int y3 = Integer.parseInt(args[5]);


        if ((y2 - y1) / (x2 - x1) == (y3 - y2) / (x3 - x2) &&
                (y3 - y2) / (x3 - x2) == (y3 - y1) / (x3 - x1))
            System.out.println("One line");
        else
            System.out.println("Not one line");
    }
}