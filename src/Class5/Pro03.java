package Class5;

import java.util.Calendar;

public class Pro03 {
    public static void main(String[] args) {
        //取出文件名的后缀名
        String path = "F:\\张劲波\\Java\\05\\作业.txt";
        int x = path.lastIndexOf('.');
        String suffix = path.substring(x);  //带.的后缀名

        //先用Calendar类获取当前日期和时间
        Calendar c = Calendar.getInstance();
        //Calendar对象的get()方法能获取日期和时间的部分值，参数在Calendar类中以常量的形式给出
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        int milliSecond = c.get(Calendar.MILLISECOND);

        //调用String类的静态方法format()，将日期和时间的部分值格式化为字符串
        String s = String.format("%4d%02d%02d%02d%%02d%02d%03d", year, month, day, hour, minute, second, milliSecond);
        //拼接字符串
        s = "E:\\upload\\" + s + suffix;
        System.out.println(s);
    }
}
