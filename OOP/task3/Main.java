/*
 * Задача 3.
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходных и праздничных днях.
 */

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        Calendar.Day day1 = new Calendar.Day(2012, 10, 3);
        Calendar.Day day2 = new Calendar.Day(2012, 1, 1);
        Calendar.Day day3 = new Calendar.Day(2013, 5, 5);
        Calendar.Day day4 = new Calendar.Day(2019, 8, 17);
        Calendar.Day day5 = new Calendar.Day(2018, 6, 6);

        day1.setHoliday(true);
        day3.setHoliday(true);
        day4.setHoliday(true);
        day2.setDayOff(true);
        day5.setDayOff(true);

        calendar.addDays(day1, day2, day3, day4, day5);

        System.out.println(calendar);

        calendar.delDay(day2);

        System.out.println(calendar);
    }
}
