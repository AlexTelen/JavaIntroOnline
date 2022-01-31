/**
 * 1. Создайте класс Test1 двумя переменными.
 * Добавьте метод вывода на экран и методы
 * изменения этих переменных. Добавьте метод,
 * который находит сумму значений этих
 * переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

class Test1 {
    private int a = 1;
    private float b = 2.1f;

    public void print() {
        System.out.println("A: " + a + "\nB: " + b);
    }

    public void increase() {
        a++;
        b++;
        print();
    }

    public void square() {
        a = (int) Math.pow(a, 2);
        b = (float) Math.pow(b, 2);
        print();
    }

    public float sum() {
        return a + b;
    }

    public float max() {
        return Math.max(a, b);
    }
}

public class SimpleClass1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.print();
        test.increase();
        test.square();
        System.out.println("Sum:" + test.sum());
        System.out.println("Max:" + test.max());
    }
}

