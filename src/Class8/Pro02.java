package Class8;

public class Pro02 {
    public static void main(String[] args) {
        //创建Runnable接口的子类MyRun的对象
        MyRun myRun = new MyRun();

        //创建Thread类的对象，构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(myRun);

        //调用start()方法开启新线程，执行run()方法
        t.start();
    }
}

//定义Runnable接口的子类，重写run()方法
class MyRun implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);  //休眠1秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("计数完毕！");
    }
}
