package Class1;

public class Pro02 {
    public static void main(String[] args) {
        //创建对象
        Student stu = new Student();
        //给封装的数据赋值
        stu.setSno("2201170343");
        stu.setName("陈祖铭");
        stu.setGender('男');
        stu.setAge(19);
        stu.setHeight(1.70);

        System.out.println(stu.getInfo());
    }
}
