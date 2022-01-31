/**
 * 5. Опишите класс, реализующий десятичный счетчик,
 * который может увеличивать или уменьшать свое
 * значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями
 * по умолчанию и произвольными значениями. Счетчик
 * имеет методы увеличения и уменьшения состояния,
 * и метод позволяющее получить его текущее
 * состояние. Написать код, демонстрирующий все
 * возможности класса.
 */
class Counter {
    private int value;
    private int lowlimit;
    private int highlimit;

    public Counter() {
        this.lowlimit = 0;
        this.highlimit = 10;
    }

    public Counter(int lowlimit, int highlimit) {
        this.lowlimit = lowlimit;
        this.highlimit = highlimit;
        this.value = lowlimit;
    }

    public void increase() {
        if (this.value + 1 <= this.highlimit)
            this.value++;
    }

    public void decrease() {
        if (this.value - 1 >= this.lowlimit)
            this.value--;
    }

    public int getValue() {
        return this.value;
    }
}

public class SimpleClass5 {
    public static void main(String[] args) {

        int prev;
        Counter counter1 = new Counter();
        System.out.println("Counter 1");

        System.out.println("\nIncrease to max:");
        do {
            prev = counter1.getValue();
            counter1.increase();
            System.out.print(counter1.getValue() + " ");
        } while (prev != counter1.getValue());

        System.out.println("\nDecrease to min:");
        do {
            prev = counter1.getValue();
            counter1.decrease();
            System.out.print(counter1.getValue() + " ");
        } while (prev != counter1.getValue());
        System.out.println();

        Counter counter2 = new Counter(12, 30);
        System.out.println("\nCounter 2");

        System.out.println("\nIncrease to max:");
        do {
            prev = counter2.getValue();
            counter2.increase();
            System.out.print(counter2.getValue() + " ");
        } while (prev != counter2.getValue());

        System.out.println("\nDecrease to min:");
        do {
            prev = counter2.getValue();
            counter2.decrease();
            System.out.print(counter2.getValue() + " ");
        } while (prev != counter2.getValue());
    }
}
