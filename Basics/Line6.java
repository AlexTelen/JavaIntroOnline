
/**
 * 6. Для данной области составить линейную программу, которая
 * печатает true, если точка с координатами (х, у) принадлежит
 * закрашенной области, и false — в противном случае
 */



public class Line6 {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        boolean answer = (y > -3 && y < 0 && x > -4 && x < 4) || //Проверка на принадлежность к нижней части закрашенной области
                (y > 0 && y < 4 && x > -2 && x < 2); //Проверка на принадлежность к верхней части закрашенной области

        System.out.println(answer);
    }
}
