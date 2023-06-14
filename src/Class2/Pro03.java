package Class2;

import java.util.Scanner;

public class Pro03 {
    public static void main(String[] args) {
        //定义一个int变量并给初值，用于存放输入的数字
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字：");
        int i = sc.nextInt();

        int num = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                num++;
            }
        }
        if (num == 2) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }
}
