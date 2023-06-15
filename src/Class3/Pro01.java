package Class3;

public class Pro01 {
    public static void main(String[] args) {
        //给出一个一维整型数组并初始化，求该数组中的最大值和最小值
        int[] a = {8, 6, 59, 12, 6, 2, 9, 10, 11, 15, 6, 3, 1, 7, 13, 14, 4, 5};
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            } else if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("最小值为：" + min);
        System.out.println("最大值为：" + max);
    }
}
