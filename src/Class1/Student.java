package Class1;

public class Student {
    //成员变量，一般设为私有属性private，即只能在Student类的内部访问
    private String sno;  //存储学号
    private String name;  //存储姓名
    private char gender;  //存储性别
    private int age;  //存储年龄
    private double height;  //存储身高

    //构造函数——函数名与类名相同，没有返回类型。作用是对成员变量进行初始化
    public Student(String sno, String name, char gender, int age, double height) {
        this.sno = sno;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public Student() {
        this.sno = sno;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    //成员方法getInfo()返回学生的所有信息
    public String getInfo() {
        //this代表当前类将来生成的对象，在这里this.age可以直接写成age
        String s = "学号：" + sno + "\n姓名：" + name + "\n性别：" + gender + "\n年龄：" + age + "\n身高：" + height;
        return s;
    }

    //与成员变量对应的getter和setter方法，用来控制外部对成员变量的读写权限
    //成员变量有对应的getter方法，说明能在外部读取该变量得知，有setter说明能在外部更改该变量的值
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}