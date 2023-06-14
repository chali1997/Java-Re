package Class2;

public class Pro05 {
    public static void main(String[] args) {
        int abc, a, b, c;
        for (abc = 100; abc < 1000; abc++) {
            a = abc / 100;
            b = abc % 100 / 10;
            c = abc % 10;
            if (abc == a * a * a + b * b * b + c * c * c) {
                System.out.println(abc);
            }
        }
    }
}
