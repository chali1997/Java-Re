package Class8;

public class Pro01 extends Thread {
    public static void main(String[] args) {
        //启动线程
        Pro01 p = new Pro01();
        p.start();
    }

    //重写run方法
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);  //线程休眠1秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("计数完毕！");
        super.run();
    }
}
