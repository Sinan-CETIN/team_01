package week_06.live_class;

public class Question_06_24 {
    public static void main(String[] args) {
        printCalendar();
    }

    public static void printCalendar() {

        long totalMilliseconds = System.currentTimeMillis();
        int currentHour = getCurrentHour(totalMilliseconds);
        int currentMinute = getCurrentMinute(totalMilliseconds);
        int currentSeconds = getCurrentSeconds(totalMilliseconds);
        int currentYear = getCurrentYear(totalMilliseconds);
        int currentMonth = getCurrentMonth(totalMilliseconds, currentYear);
        int currentDay = getCurrentDay(totalMilliseconds, currentYear);

        System.out.println("Current time and date is : " + (currentHour % 12) +
                ":" + currentMinute + ":" + currentSeconds + " " +
                ((currentHour > 12) ? "PM" : "AM")
                + "   " + currentMonth + "  /  " + currentDay + "  /  " + currentYear);
    }


   //28 /24  = 4

    public static int getCurrentSeconds(long milliSeconds) {
        return getTotalSeconds(milliSeconds) % 60;
    }

    public static int getTotalSeconds(long milliseconds) {
        return (int) (milliseconds / 1000);
    }

    public static int getCurrentMinute(long milliseconds) {
        return getTotalMinutes(milliseconds) % 60;
    }

    public static int getTotalMinutes(long milliseconds) {
        return getTotalSeconds(milliseconds) / 60;
    }

    public static int getCurrentHour(long milliseconds) {
        return getTotalHour(milliseconds) % 24;
    }

    public static int getTotalHour(long milliseconds) {
        return getTotalMinutes(milliseconds) / 60;
    }

    public static int getCurrentYear(long milliseconds) {
        int totalDays = getTotalDays(milliseconds);
        int year = 1970;
        while (totalDays > daysInYear(year)) {
            totalDays -= daysInYear(year);
            year++;
        }
        return year;
    }

    private static int getTotalDays(long milliseconds) {
        return getTotalHour(milliseconds) / 24;
    }

    public static int daysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int getCurrentMonth(long milliseconds, int year) {
        int numberOfDaysInCurrentYear = getTotalDaysInCurrentYear(milliseconds, year);
        int month = 1;
        while (numberOfDaysInCurrentYear > getNumberOfDaysInMonth(month, year)) {
            numberOfDaysInCurrentYear -= getNumberOfDaysInMonth(month, year);
            month++;
        }

        return month;
    }

    public static int getTotalDaysInCurrentYear(long milliseconds, int year) {
        int sum = 0; // total days until the start of current year
        for (int i = 1970; i < year; i++) {
            sum += isLeapYear(i) ? 366 : 365;
        }
        return getTotalDays(milliseconds) - sum;
    }

    public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 30;
        }
    }

    public static int getCurrentDay(long milliseconds, int year) {
        int totalDaysInCurrentYear = getTotalDaysInCurrentYear(milliseconds, year);
        int month = 1;
        while (totalDaysInCurrentYear > getNumberOfDaysInMonth(month, year)) {
            totalDaysInCurrentYear -= getNumberOfDaysInMonth(month, year);
            month++;
        }
        int currentDayInMonth = totalDaysInCurrentYear + 1;

        return currentDayInMonth;
    }

}
