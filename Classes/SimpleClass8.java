/**
 * 8. Создать класс Customer, спецификация
 * которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с
 * подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести
 * эти данные на консоль.
 * <p>
 * Класс Customer: id, фамилия, имя, отчество,
 * адрес, номер кредитной карточки, номер
 * банковского счета.
 * <p>
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер
 * кредитной карточки находится в заданном
 * интервале
 */

class Customer {
    private int id;
    private String surname;
    private String name;
    private String secondName;
    private String address;
    private long creditCardNumber;
    private long bankAccountNumber;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public Customer(int id, String surname, String name, String secondName, String address, long creditCardNumber, long bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer() {
    }

    public String toString() {
        return this.id + " | " + this.surname + " | " + this.name + " | " + this.secondName + " | " + this.address + " | " + this.creditCardNumber + " | " + this.bankAccountNumber;
    }
}

class Shop {

    private Customer[] customers;

    Shop(Customer[] customers) {
        this.customers = customers;
    }

    public void sortPrint() {
        Customer[] sortArray = customers;
        for (int i = 1; i < customers.length; ) {
            if (sortArray[i - 1].getSurname().compareTo(sortArray[i].getSurname()) > 0) {
                Customer temp = sortArray[i - 1];
                sortArray[i - 1] = sortArray[i];
                sortArray[i] = temp;
                i = 1;
            } else
                i++;
        }
        for (int i = 0; i < customers.length; i++)
            System.out.println(sortArray[i].toString());
    }

    public void printRange(long min, long max) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() > min && customer.getCreditCardNumber() < max)
                System.out.println(customer.toString());
        }
    }
}

public class SimpleClass8 {
    public static void main(String[] args) {

        Customer customer1 = new Customer(12, "Smith", "John", "Michael", "39 Baker St.", 4567_8555_8132_2583L, 684351456765L);
        Customer customer2 = new Customer(15, "Simpson", "Anthony", "Louis", "13 Green St.", 6585_6556_5632_5123L, 5645456465465L);
        Customer customer3 = new Customer(19, "Garrison", "Randall", "Jack", "3 Washington Av.", 5835_3656_1622_2323L, 5645456465465L);
        Shop shop = new Shop(new Customer[]{customer1, customer2, customer3});
        shop.sortPrint();
        System.out.println();
        shop.printRange(123456789123456L, 6585_6556_5632_5120L);
    }
}
