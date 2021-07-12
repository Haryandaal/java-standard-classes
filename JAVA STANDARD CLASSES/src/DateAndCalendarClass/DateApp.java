package DateAndCalendarClass;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE,15);
        calendar.set(Calendar.MONTH,Calendar.NOVEMBER);
//DAN LAIN LAIN
        Date result = calendar.getTime();
        System.out.println(result);
    }
}
