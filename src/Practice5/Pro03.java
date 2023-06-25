package Practice5;

import java.util.Scanner;

public class Pro03 {
    public static void main(String[] args) {
        System.out.print("请输入数字：");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        Pro03 p = new Pro03();
        System.out.println(p.isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }
}
