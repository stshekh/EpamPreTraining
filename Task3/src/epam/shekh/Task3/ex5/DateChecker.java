package epam.shekh.Task3.ex5;

public class DateChecker {
    private int day;
    private int month;
    private int year;

    private int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateChecker(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    private boolean checkDate() {
        boolean isOk = true;
        if (year <= 0) {
            isOk = false;
        }
        if (month < 1 || month > 12) {
            isOk = false;
        }
        if (day < 1 || day > 31) {
            isOk = false;
        }
        return isOk;
    }

    private boolean isBigYear() {
        boolean isBig = true;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                isBig = false;
            }
        }

        return isBig;
    }
    private void specialDay(int i) {
        if (daysInMonths[i] == day && month == 12) {
            year++;
            day = 1;
            month = 1;

        } else if (daysInMonths[i] == day && month != 12) {
            month++;
            day = 1;
        } else {
            day++;
        }
    }

    public String nextDay() {
        if (!checkDate()) {
            return "Wrong input date";
        }

        if (isBigYear()) {
            daysInMonths[1] = 29;
        }

        for (int i = 0; i < 12; i++) {
            if (day <= daysInMonths[i] && month == i + 1) {
                specialDay(i);
                return day + "-" + month + "-" + year;
            }
        }
        return "Wrong date. You entered more days for this month";
    }




}
