/**
 * 4. Создайте класс Train, содержащий поля:
 * название пункта назначения, номер поезда,
 * время отправления. Создайте данные в массив
 * из пяти элементов типа Train, добавьте
 * возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода
 * информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки
 * массив по пункту назначения, причем поезда с
 * одинаковыми пунктами назначения должны быть
 * упорядочены по времени отправления.
 */

import java.util.Scanner;

class Train {
    String destination;
    int number;
    String time;

    public Train(String destination, int number, String time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    void printInfo() {
        System.out.println("Number: " + this.number);
        System.out.println("Destination: " + this.destination);
        System.out.println("Time: " + this.time);
    }
}

public class SimpleClass4 {

    static void sortNumber(Train[] trains) {
        for (int i = 1; i < trains.length; ) {
            if (trains[i - 1].number > trains[i].number) {
                Train temp = trains[i - 1];
                trains[i - 1] = trains[i];
                trains[i] = temp;
                i = 1;
            } else
                i++;
        }
    }

    static void sortDestination(Train[] trains) {
        for (int i = 1; i < trains.length; ) {
            if (trains[i - 1].destination.compareTo(trains[i].destination) > 0 || (trains[i - 1].destination.compareTo(trains[i].destination) == 0 && trains[i - 1].time.compareTo(trains[i].time) > 0)) {
                Train temp = trains[i - 1];
                trains[i - 1] = trains[i];
                trains[i] = temp;
                i = 1;
            } else
                i++;
        }
    }

    static void showInfo(int number, Train[] trains) {
        for (Train i : trains)
            if (i.number == number) {
                i.printInfo();
                break;
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Train train1 = new Train("Viciebsk", 649, "12:00");
        Train train2 = new Train("Homiel", 449, "11:00");
        Train train3 = new Train("Viciebsk", 647, "13:30");
        Train train4 = new Train("Slonim", 7001, "13:00");
        Train train5 = new Train("Viciebsk", 679, "15:00");
        Train[] trains = new Train[]{train1, train2, train3, train4, train5};

        System.out.println("Sort trains by number: ");
        sortNumber(trains);
        for (Train train : trains)
            train.printInfo();
        System.out.println();
        System.out.println("Sort trains by destination: ");
        sortDestination(trains);
        for (Train train : trains)
            train.printInfo();
        System.out.println();

        System.out.print("Show info by train number: ");
        showInfo(scan.nextInt(), trains);
    }
}
