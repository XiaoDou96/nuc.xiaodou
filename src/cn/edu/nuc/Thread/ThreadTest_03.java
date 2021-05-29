package cn.edu.nuc.Thread;

public class ThreadTest_03 {
    /**
     * 1.创建一个实现Runnable接口的类
     * 2.实现类去实现Runnable中的抽象方法run()
     * 3.创建实现类的对象
     * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
     * 5.通过Thread类的对象调用start()方法
     */
    public static void main(String[] args) {
        MThread mThread=new MThread();
        Thread thread=new  Thread(mThread);
        thread.start();
    }
}
class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
