package Class2;

import java.util.Scanner;

public class Pro01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("输入成绩：");
        int score = sc.nextInt();

        if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else if (score >= 60 && score < 75) {
            System.out.println("及格");
        } else if (score >= 75 && score < 90) {
            System.out.println("良好");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else {
            System.out.println("无效成绩！");
        }
    }
}
