import java.util.*;

public class Calendar {

    private String name;
    private List<Day> days;

    public Calendar() {
        this.name = "calendar";
        this.days = new ArrayList<>();
    }

    public Calendar(String name, List<Day> days) {
        this.name = name;
        this.days = days;
    }

    public static class Day {
        private int year;
        private int monthOfYear;
        private int dayOfMonth;
        private boolean isHoliday;
        private boolean isDayOff;

        public Day() {
            setDefault();
        }

        public Day(int year, int monthOfYear, int dayOfMonth) {
            if (year >= 0
                    && (monthOfYear >= 1 && monthOfYear <= 12)
                    && (dayOfMonth >= 1 && dayOfMonth <= 31)) {
                this.year = year;
                this.monthOfYear = monthOfYear;
                this.dayOfMonth = dayOfMonth;
                this.isHoliday = false;
                this.isDayOff = false;
            } else {
                System.out.println("Day isn't correct!");
                setDefault();
            }
        }

        private void setDefault() {
            this.year = 0;
            this.monthOfYear = 1;
            this.dayOfMonth = 1;
            this.isHoliday = false;
            this.isDayOff = false;
        }

        public boolean isHoliday() {
            return isHoliday;
        }

        public void setHoliday(boolean holiday) {
            isHoliday = holiday;
        }

        public boolean isDayOff() {
            return isDayOff;
        }

        public void setDayOff(boolean dayOff) {
            isDayOff = dayOff;
        }

        @Override
        public String toString() {
            return new StringJoiner("")
                    .add(year + ":")
                    .add(monthOfYear + ":")
                    .add("" + dayOfMonth)
                    .add("  Holiday - " + isHoliday)
                    .add("  DayOff - " + isDayOff)
                    .toString();
        }
    }

    public void addDays(Day... day) {
        days.addAll(Arrays.asList(day));
    }

    public boolean delDay(Day day) {
        return days.remove(day);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        days.forEach(d -> stringBuilder.append(d.toString() + "\n"));

        return new StringJoiner(" ")
                .add("calendar  '" + name + "'")
                .add("days:\n" + stringBuilder)
                .toString();
    }
}
