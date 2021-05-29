package cn.edu.nuc.Thread;

/**
 * 方式一 继承Thread类
 * 1.创建一个继承Thread的子类
 * 2.重写run()方法-->此线程执行的操作写入方法中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 * 例子：遍历100以内的所有偶数
 */
public class ThreadTest_01 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

    }
}
class  MyThread extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
