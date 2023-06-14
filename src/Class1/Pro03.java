package Class1;

public class Pro03 {
    public static void main(String[] args) {
        //创建Student对象，同时初始化成员变量
        Student stu = new Student("2201170343", "李四", '女', 19, 1.60);

        //修改数据
        stu.setName("陈祖铭");
        stu.setGender('男');
        stu.setHeight(1.70);

        //获取所有信息
        String s = stu.getInfo();
        System.out.println(s);
    }
}
