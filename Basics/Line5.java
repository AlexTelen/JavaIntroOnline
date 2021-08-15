
/**
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */



public class Line5 {

    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);

        int h = t / 3600; // часы
        int m = t / 60 - h * 60; // минуты
        int s = t - h * 3600 - m * 60; //секунды

        System.out.println(h + " h " + m + " m " + s + " s ");
    }
}