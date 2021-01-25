package demo;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {

        System.out.println(formatTime(new Date(1611100928472L)));

    }

    private static String formatTime(Date date){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTimeInMillis());
        long timeInMillis = calendar.getTimeInMillis() - date.getTime();
        if (timeInMillis < 0) return "Invalid";
        long timeInSecond = timeInMillis / 1000;
        if (timeInSecond < 60) return String.format(Locale.getDefault(), "%d seconds ago", timeInSecond);
        long timeInMinute = timeInSecond / 60;
        if (timeInMinute < 60) return String.format(Locale.getDefault(), "%d minutes ago", timeInMinute);
        long timeInHour = timeInMinute / 60;
        if (timeInHour < 24) return String.format(Locale.getDefault(), "%d hours ago", timeInHour);
        long timeInDay = timeInHour / 24;
        if (timeInDay == 7) return "1 week ago";
        if (timeInDay == 14) return "2 weeks ago";
        if (timeInDay == 21) return "3 weeks ago";
        if (timeInDay == 28) return "4 weeks ago";
        if (timeInDay < 30) return String.format(Locale.getDefault(), "%d days ago", timeInDay);
        long timeInMonth = timeInDay / 30;
        if (timeInMonth < 12) return String.format(Locale.getDefault(), "%d months ago", timeInMonth);
        long timeInYear = timeInMonth / 365;
        return String.format(Locale.getDefault(), "%d years ago", timeInYear);
    }
}
