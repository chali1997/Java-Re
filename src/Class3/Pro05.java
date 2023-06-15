package Class3;

public class Pro05 {
    public static void main(String[] args) {
        //随机产生一组双色球彩票数字，注意红色号码的数字是不能重复的，程序要避免这个问题
        //Math.random()返回带正号的double值，该值大于等于0.0且小于1.0
        int[] a = new int[7];
        for (int i = 0; i < 6; i++) {  //产生6个1~33的红色号码
            a[i] = (int) (33 * Math.random() + 1);
            boolean flag = false;  //先假定和前面0~i-1个号码不重复
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    flag = true;  //有相等的
                }
                if (flag == true) {  //产生的第i个数，与之间的数有相等的情况
                    i--;  //i=i-1，让循环再来一次，而且不能小于0
                    //更好的：i=i>1 ? i-1 : 1;
                }
            }
        }
        a[6] = (int) (15 * Math.random() + 1);  //蓝色号码
        //输出
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
