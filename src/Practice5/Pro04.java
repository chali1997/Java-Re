package Practice5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pro04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        String s = String.format("%4d年%02d月%02d日 " + dateFormat.format(d) + " " + weekDays[week - 1],
                year, month, day);
        System.out.println(s);
    }
}
