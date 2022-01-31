/**
 * 10. Создать класс Airline, спецификация
 * которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс,
 * агрегирующий массив типа Airline, с
 * подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести
 * эти данные на консоль.
 * <p>
 * Airline: пункт назначения, номер рейса,
 * тип самолета, время вылета, дни недели.
 * <p>
 * Найти и вывести:
 * a) список рейсов для заданного пункта
 * назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели,
 * время вылета для которых больше заданного.
 */

import java.time.*;

class Airline {
    private String destinationPoint;
    private String flightNumber;
    private String type;
    private LocalTime time;
    private String days;


    public Airline(String destinationPoint, String flightNumber, String type, LocalTime time, String days) {
        this.destinationPoint = destinationPoint;
        this.flightNumber = flightNumber;
        this.type = type;
        this.time = time;
        this.days = days;
    }

    public String toString() {
        return this.destinationPoint + " | " + this.flightNumber + " | " + this.type + " | " + this.time + " | " + this.days;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}

class Airport {

    private Airline[] flights;

    Airport(Airline[] flights) {
        this.flights = flights;
    }


    public void selectDestinationPoint(String destinationPoint) {
        for (Airline flight : flights) {
            if (flight.getDestinationPoint().equals(destinationPoint)) {
                System.out.println(flight.toString());
            }
        }
    }

    public void selectDay(String day) {
        for (Airline flight : flights) {
            if (flight.getDays().contains(day)) {
                System.out.println(flight.toString());
            }
        }
    }

    public void selectTime(String day, LocalTime time) {
        for (Airline flight : flights) {
            if (flight.getDays().contains(day) && flight.getTime().compareTo(time) > 0) {
                System.out.println(flight.toString());
            }
        }
    }
}

public class SimpleClass10 {
    public static void main(String[] args) {
        Airline airline1 = new Airline("London", "B2 0834/0841", "737", LocalTime.parse("11:30:00"), "Monday, Friday");
        Airline airline2 = new Airline("Barcelona", "B2 0854/0812", "737/E95", LocalTime.parse("15:00:00"), "Tuesday, Thursday, Sunday");
        Airline airline3 = new Airline("London", "B2 0850/0841", "737", LocalTime.parse("18:10:00"), "Friday, Sunday");

        Airport airport = new Airport(new Airline[]{airline1, airline2, airline3});
        airport.selectDestinationPoint("London");
        System.out.println();
        airport.selectDay("Friday");
        System.out.println();
        airport.selectTime("Sunday", LocalTime.parse("16:00:00"));
    }
}