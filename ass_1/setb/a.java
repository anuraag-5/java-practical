package ass_1.setb;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;

/**
 * Prints the system date and time in several formats using
 * java.util.Date, java.text.SimpleDateFormat, and Calendar.
 */
public class a {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();

        // 1) dd/MM/yyyy  --> 31/08/2021
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + f1.format(now));

        // 2) MM-dd-yyyy  --> 08-31-2021
        SimpleDateFormat f2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + f2.format(now));

        // 3) Tuesday, 31 August 2021
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE, d MMMM yyyy", Locale.ENGLISH);
        System.out.println("Current date is : " + f3.format(now));

        // 4) Tue Aug 31 15:25:59 IST 2021
        SimpleDateFormat f4 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        System.out.println("Current date and time is : " + f4.format(now));

        // 5) 15:25:59
        SimpleDateFormat f5 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is : " + f5.format(now));

        // 6) 31/08/21 03:25:59 PM +0530
        SimpleDateFormat f6 = new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z");
        System.out.println("Current date and time is : " + f6.format(now));

        // ---- Missing lines from your assignment ----
        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("Current week of year is : " + weekOfYear);
        System.out.println("Current week of month is : " + weekOfMonth);
        System.out.println("Current day of year is : " + dayOfYear);
        // ------------------------------------------------
    }
}
