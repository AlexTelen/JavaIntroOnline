/*
 * Задача 2.
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */
public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment(100);

        payment.addProduct(new Payment.Product("Phone", 1, 199.99));
        payment.addProduct(new Payment.Product("iPhone", 2, 1099));
        payment.addProduct(new Payment.Product("Watch", 3, 326.98));
        payment.addProduct(new Payment.Product("Laptop", 11, 2199.50));
        payment.addProduct(new Payment.Product("SSD", 51, 78.00));

        payment.getProducts().forEach(System.out::println);

        System.out.printf("Bill: %.2f", payment.getBill());
    }
}
