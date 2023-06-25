package Class4;

import java.util.Scanner;

public class Pro01 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Pro01 pro = new Pro01();  //方法一般通过对象调用
        boolean flag = pro.isPrime(num);  //方法只负责判断，并返回结果
        if (flag == true) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }

    //写一个方法，判断某个整数是不是素数
    public boolean isPrime(int num) {  //代入整数num，返回是或否
        boolean flag = true;  //作标记，假设num是素数
        for (int i = 2; i < num; i++) {  //循环，用num除以2~num-1
            if (num % i == 0) {  //除尽了
                flag = false;  //只要除尽了，就不是素数
                break;  //跳出循环
            }
        }
        return flag;
    }
}
