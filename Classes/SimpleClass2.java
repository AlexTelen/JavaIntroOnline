/**
 * 2. Создйте класс Test2 двумя переменными.
 * Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены
 * класса по умолчанию. Добавьте set- и get-
 * методы для полей экземпляра класса.
 */

class Test2 {
    private int a;
    private float b;

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test2() {
        this.a = 1;
        this.b = 2;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(float b) {
        this.b = b;
    }

    int getA() {
        return a;
    }

    float getB() {
        return b;
    }

    void print() {
        System.out.println("A: " + a + " B: " + b);
    }
}

public class SimpleClass2 {
    public static void main(String[] args) {
        Test2 test = new Test2(1, 2);
        test.print();
        Test2 test2 = new Test2();
        test2.print();
        System.out.println("GET: " + test.getA() + " " + test.getB());
        test.setA(40);
        test.setB(6.9f);
        System.out.println("SET: " + test.getA() + " " + test.getB());
    }
}
