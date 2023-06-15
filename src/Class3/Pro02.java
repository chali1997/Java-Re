package Class3;

public class Pro02 {
    public static void main(String[] args) {
        //给出一个二维整型数组并初始化，求该二维数组元素中偶数的和
        int[][] a = new int[][]{   //二维整型数组用int[][]定义
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        int sum = 0;  //记录偶数和
        for (int i = 0; i < a.length; i++) {  //a.length是二维数组的行数
            for (int j = 0; j < a[i].length; j++) {  //a[i].length是第i行的列数
                if (a[i][j] % 2 == 0) {  //a[i][j]是偶数
                    sum += a[i][j];  //sum=sum+a[i][j]
                }
            }
        }
        System.out.println("偶数和为：" + sum);
    }
}

