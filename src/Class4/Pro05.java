package Class4;

public class Pro05 {
    /*a-i是1~9中的各不相同的数字，且满足式子abcd*e=fghi
     * 请输出满足要求的式子，需要定义下面的方法：
     * 1.判断四位数abcd或fghi中是否包括数字e
     * 2.判断四位数abcd或fghi中是否有重复数字
     * 3.判断四位数abcd或fghi中是否包括相同的数字
     * 4.判断四位数abcd或fghi中是否包括0，与1.相同*/
    public static void main(String[] args) {
        //创建对象
        Pro05 pro = new Pro05();
        for (int abcd = 1000; abcd < 10000; abcd++) {
            //如果abcd中包含0，或者abcd中有重复数字，不满足题意，结束本次循环，进入下一次循环
            if (pro.baohan(abcd, 0) || pro.chongfu(abcd)) {
                continue;  //结束本次循环，进入下一次循环（abcd++）
            }
            for (int e = 1; e < 10; e++) {
                //如果abcd中包含e，不满足题意，结束本次循环，进入下一次循环
                if (pro.baohan(abcd, e)) {
                    continue;  //结束本次循环，进入下一次循环（e++）
                }
                int fghi = abcd * e;  //计算abcd与e的乘积
                //如果fghi是四位数，fghi不包括e，fghi不包括0，fghi中没有重复数字，fghi与abcd不相同，满足题意
                if (fghi < 10000 && pro.baohan(fghi, e) == false
                        && pro.baohan(fghi, 0) == false
                        && pro.chongfu(fghi) == false
                        && pro.xiangtong(fghi, abcd) == false) {
                    System.out.println(abcd + "*" + e + "=" + fghi);
                }
            }
        }
    }

    //判断四位数abcd或fghi中是否包括数字e
    //方法baohan()用于判断多位整数abcd是否包括数字e，abcd并不限定是四位数
    public boolean baohan(int abcd, int e) {
        boolean flag = false;  //先假定不包括
        int x = abcd;
        while (x > 0) {  //利用循环，依次取出d、c、b、a
            if (x % 10 == e) {  //取出个位数字
                flag = true;  //发现与e相等的数字，说明包括
                break;  //跳出循环
            }
            x = x / 10;  //每次循环，x依次为abcd、abc、ab、a、0
        }
        return flag;
    }

    //判断四位数abcd或fghi中是否有重复数字
    //方法chongfu()判断abcd中是否有重复出现的数字，不限定abcd是四位数
    public boolean chongfu(int abcd) {
        boolean flag = false;  //先假定没有重复数字
        int x, y;
        while (abcd > 0) {
            x = abcd / 10;  //x最先等于abc
            y = abcd % 10;  //y最先等于d
            //调用自定义方法baohan()，判断x中是否包含y，第一次是判断abc是否包括d
            if (baohan(x, y) == true) {
                flag = true;  //说明有重复数字，退出循环
                break;
            }
            abcd = abcd / 10;  //abcd依次变为abc、ab、a
        }
        return flag;
    }

    //判断四位数abcd或fghi中是否包括相同的数字
    //方法xiangtong()用于判断一个多位数abcd是否包括另一个多位数fghi中的数字
    public boolean xiangtong(int abcd, int fghi) {
        boolean flag = false;  //先假定没有相同数字
        int x;
        while (fghi > 0) {  //依次判断abcd是否包括fghi中的数字
            x = fghi % 10;  //取出fghi的最后一位数字
            if (baohan(abcd, x) == true) {
                flag = true;  //abcd包括另一个数中的数字，说明有相同数字
                break;  //跳出循环
            }
            fghi = fghi / 10;  //fghi依次变为fgh、fg、f
        }
        return flag;
    }
}
