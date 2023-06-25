package Class4;

public class Pro03 {
    public static void main(String[] args) {
        //创建对象
        Pro03 pro = new Pro03();
        //调用方法
        int[] a = {8, 6, 2, 7, 6, 9, 3, 1, 4, 5};
        pro.mappao(a);
        //输出结果
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        double[] b = {1.58, 1.55, 1.72, 1.78, 1.70, 1.65, 1.80, 1.68, 1.75, 1.60};
        pro.maopao(b);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + "\t");
        }
    }

    //写一个方法，该方法可以对一维整型数组元素进行排序
    public void mappao(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {  //从小到大排序
                    temp = a[j + 1];  //交换
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /*方法的重载：一个类中有多个同名的方法，这些方法的参数类型或参数个数不一样
     * 重载能使方法具有多种用途，却只需使用一个方法名
     * */
    public void maopao(double[] a) {
        double temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
