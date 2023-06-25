package Practice5;

import java.util.Scanner;

public class Pro02 {
    public static void main(String[] args) {
        System.out.print("请输入字符：");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str2);
    }
}
