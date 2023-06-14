package Class2;

import java.util.Scanner;

public class Pro02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入1~7之间的数字：");
        int i = sc.nextInt();

        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
        }
    }
}
