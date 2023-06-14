package Class1;

public class Pro04 {
    public static void main(String[] args) {
        //定义数组变量，可以存储45个学生的信息
        Student[] stus = new Student[45];

        //对数组前三个元素赋值。实际应用中，这些数据是从数据库中读出的
        stus[0] = new Student("1801170641", "张三", '男', 19, 1.75);
        stus[1] = new Student("1801170642", "李四", '女', 19, 1.62);
        stus[2] = new Student("2201170343", "陈祖铭", '男', 19, 1.70);

        //输出
        for (int i = 0; i < 3; i++) {
            System.out.println(stus[i].getInfo() + "\n");
        }
    }
}
