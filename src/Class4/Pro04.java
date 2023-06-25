package Class4;

import java.util.Scanner;

public class Pro04 {
    public static void main(String[] args) {
        System.out.print("请输入一个1~10之间的数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Pro04 pro = new Pro04();
        int result = pro.factorial(num);
        System.out.println(num + "的阶乘是：" + result);
    }

    public int factorial(int num) {
        int result;
        if (num == 1) {
            result = 1;
        } else {
            result = num * factorial(num - 1);  //调用方法本身
        }
        return result;
    }
}
