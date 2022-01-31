/**
 * 5. Туристические путевки. Сформировать
 * набор предложений клиенту по выбору
 * туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг,
 * круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта,
 * питания и числа дней. Реализовать выбор
 * и сортировку путевок.
 */

import java.util.Scanner;

class Trip {
    private String name;
    private String type;
    private String[] transport;
    private String[] food;
    private int[] days;

    public Trip() {
    }

    Trip(String name, String type, String[] transport, String[] food, int[] days) {
        this.name = name;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public String toString() {
        StringBuilder ret = new StringBuilder(this.getName() + " | " + this.getType() + " | ");
        for (String transport : this.getTransport()) {
            ret.append(transport).append(" ");
        }
        ret.append("| ");
        for (String food : this.getFood()) {
            ret.append(food).append(" ");
        }
        ret.append("| ");
        for (int days : this.getDays()) {
            ret.append(days).append(" ");
        }
        ret.append("| ");
        return ret.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getTransport() {
        return transport;
    }

    public void setTransport(String[] transport) {
        this.transport = transport;
    }

    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public int[] getDays() {
        return days;
    }

    public void setDays(int[] days) {
        this.days = days;
    }
}

class Set {
    Scanner scan = new Scanner(System.in);
    private Trip[] trips;
    private Trip choice = new Trip();

    Set(Trip[] trips) {
        this.trips = trips;
    }

    public Trip[] getTrips() {
        return this.trips;
    }

    public void setTrips(Trip[] trips) {
        this.trips = trips;
    }

    public void chooseTrip() {
        int i = 1, j = 1;
        for (Trip trip : trips) {
            System.out.println(i + ". " + trip.toString());
            i++;
        }
        System.out.print("Choose the trip: ");
        i = scan.nextInt() - 1;
        scan.nextLine();
        this.choice.setName(trips[i].getName());
        this.choice.setType(trips[i].getType());

        for (String transport : trips[i].getTransport()) {
            System.out.println(j + ". " + transport);
            j++;
        }
        System.out.print("Choose the transport: ");
        j = scan.nextInt() - 1;
        scan.nextLine();
        choice.setTransport(new String[]{trips[i].getTransport()[j]});

        j = 1;
        for (String food : trips[i].getFood()) {
            System.out.println(j + ". " + food);
            j++;
        }
        System.out.print("Choose the food: ");
        j = scan.nextInt() - 1;
        scan.nextLine();
        choice.setFood(new String[]{trips[i].getFood()[j]});

        j = 1;
        for (int days : trips[i].getDays()) {
            System.out.println(j + ". " + days);
            j++;
        }
        System.out.print("Choose number of days: ");
        j = scan.nextInt() - 1;
        scan.nextLine();
        choice.setDays(new int[]{trips[i].getDays()[j]});
    }

    public void setChoice(Trip choice) {
        this.choice = choice;
    }

    public Trip getChoice() {
        return this.choice;
    }

    public void sortType() {
        for (int i = 1; i < trips.length; ) {
            if (trips[i - 1].getType().compareTo(trips[i].getType()) > 0) {
                Trip temp = trips[i - 1];
                trips[i - 1] = trips[i];
                trips[i] = temp;
                i = 1;
            } else
                i++;
        }
    }

    public void sortName() {
        for (int i = 1; i < trips.length; ) {
            if (trips[i - 1].getName().compareTo(trips[i].getName()) > 0) {
                Trip temp = trips[i - 1];
                trips[i - 1] = trips[i];
                trips[i] = temp;
                i = 1;
            } else
                i++;
        }
    }
}

public class AggComp5 {

    public static void main(String[] args) {
        Trip trip1 = new Trip("Cyprus", "vacation", new String[]{"car", "bus", "train"}, new String[]{"pizza", "restaurant", "cafe"}, new int[]{3, 4, 8});
        Trip trip2 = new Trip("Berlin", "excursion", new String[]{"bus", "train"}, new String[]{"restaurant", "cafe"}, new int[]{1, 2, 3});
        Trip trip3 = new Trip("Delhi", "treatment", new String[]{"car", "bus"}, new String[]{"canteen", "restaurant", "cafe"}, new int[]{7, 14, 21});
        Trip trip4 = new Trip("Cardiff", "shopping", new String[]{"car", "train"}, new String[]{"KFC", "McDonald's", "cafe"}, new int[]{1, 2});
        Trip trip5 = new Trip("Rome", "cruise", new String[]{"ship", "bus", "train"}, new String[]{"pizza", "ship restaurant"}, new int[]{3, 4, 5});
        Trip trip6 = new Trip("Odessa", "vacation", new String[]{"train"}, new String[]{"restaurant", "cafe", "Burger King"}, new int[]{3, 4, 8});
        Trip trip7 = new Trip("Krakow", "excursion", new String[]{"bus", "train"}, new String[]{"KFC", "cafe"}, new int[]{2, 3, 5});
        Trip trip8 = new Trip("Helsinki", "treatment", new String[]{"car", "bus"}, new String[]{"canteen", "cafe"}, new int[]{10, 20, 30});
        Trip trip9 = new Trip("Moscow", "shopping", new String[]{"car"}, new String[]{"Burger King", "McDonald's", "cafe"}, new int[]{3, 5});
        Trip trip10 = new Trip("Barcelona", "cruise", new String[]{"ship", "boat", "car"}, new String[]{"cafe", "ship restaurant"}, new int[]{2, 4, 5});
        Set set = new Set(new Trip[]{trip1, trip2, trip3, trip4, trip5, trip6, trip7, trip8, trip9, trip10});

        int choose = -1;
        Scanner scan = new Scanner(System.in);
        while (choose != 0) {
            System.out.println("Trip support");
            System.out.println("1. Show the trips");
            System.out.println("2. Sort by name");
            System.out.println("3. Sort by type");
            System.out.println("4. Choose the trip");
            System.out.println("0. Exit");
            choose = scan.nextInt();
            scan.nextLine();
            switch (choose) {
                case 1:
                    for (Trip trip : set.getTrips())
                        System.out.println(trip.toString());
                    break;
                case 2:
                    set.sortName();
                    break;
                case 3:
                    set.sortType();
                    break;
                case 4: {
                    set.chooseTrip();
                    System.out.println(set.getChoice().toString());
                }
                break;
                default:
                    System.out.println("\n Error. Please try again" + "\n");
                    break;
            }
        }
    }
}
