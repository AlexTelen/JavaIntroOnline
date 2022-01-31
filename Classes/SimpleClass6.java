/**
 * 6. Составьте описание класса для представления
 * времени. Предусмотрте возможности установки
 * времени и изменения его отдельных полей (час,
 * минута, секунда) с проверкой допустимости
 * вводимых значений. В случае недопустимых
 * значений полей поле устанавливается в значение
 * 0. Создать методы изменения времени на заданное
 * количество часов, минут и секунд.
 */

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    void check() {
        if (this.hours > 23 || this.hours < 0)
            this.hours = 0;
        if (this.minutes > 59 || this.minutes < 0)
            this.minutes = 0;
        if (this.seconds > 59 || this.seconds < 0)
            this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        check();
    }

    void changeHours(int hours) {
        this.hours += hours;
        check();
    }

    void changeMinutes(int minutes) {
        this.minutes += minutes;
        check();
    }

    void changeSeconds(int seconds) {
        this.seconds += seconds;
        check();
    }

    void print() {
        System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
    }
}

public class SimpleClass6 {
    public static void main(String[] args) {
        Time time = new Time(12, 56, 49);
        time.print();

        System.out.println("+5 hours");
        time.changeHours(5);
        time.print();
        System.out.println("+3 minutes");
        time.changeMinutes(3);
        time.print();
        System.out.println("+7 seconds");
        time.changeSeconds(7);
        time.print();

        System.out.println("-3 hours");
        time.changeHours(-3);
        time.print();
        System.out.println("-32 minutes");
        time.changeMinutes(-32);
        time.print();
        System.out.println("-50 seconds");
        time.changeSeconds(-50);
        time.print();

        System.out.println("Wrong hours value");
        time.changeHours(-30);
        time.print();
        System.out.println("Wrong minutes value");
        time.changeMinutes(100);
        time.print();
        System.out.println("Wrong seconds value");
        time.changeSeconds(59);
        time.print();
    }
}
