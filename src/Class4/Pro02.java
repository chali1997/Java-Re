package Class4;

public class Pro02 {
    public static void main(String[] args) {
        //调用一维整型数组，并赋值
        int[] a = {8, 6, 2, 7, 6, 9, 3, 1, 4, 5};
        //调用方法
        Pro02 pro = new Pro02();
        int min = pro.getMin(a);
        System.out.println("最小值是：" + min);
        int max = pro.getMax(a);
        System.out.println("最大值是：" + max);
    }

    //写一个方法，求给定一维整型数组元素中的最小值
    public int getMin(int[] a) {  //代入一维整型数组，返回整数
        int min = a[0];  //假定数组第0个数最小
        for (int i = 0; i < a.length; i++) {  //与数据中所有元素比较
            if (a[i] < min) {  //记录最小
                min = a[i];
            }
        }
        return min;  //返回最小值
    }

    public int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
