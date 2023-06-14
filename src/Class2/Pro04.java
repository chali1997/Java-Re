package Class2;

public class Pro04 {
    public static void main(String[] args) {
        //输出1~100之间的所有素数
        for (int i = 1; i <= 100; i++) {
            boolean falg = true;
            for (int j = 2; j < i; j++) {  //i除以2~i-1之间的数，如果有能被整除的，则不是素数
                if (i % j == 0) { //除尽了
                    falg = false;
                    break;
                }
            }
        }
    }
}
