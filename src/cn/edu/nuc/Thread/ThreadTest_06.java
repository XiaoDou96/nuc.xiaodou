package cn.edu.nuc.Thread;


public class ThreadTest_06 {
    public static void main(String[] args) {
        Window_06 window=new Window_06();
        Thread thread_1=new Thread(window);
        thread_1.start();
        Thread thread=new Thread(window);
        thread.start();
        Thread thread_2=new Thread(window);
        thread_2.start();
    }
}
class Window_06 implements Runnable{
    private static int ticket=1000;

    @Override
    public void run(){
        while(ticket<=1000&&ticket>2){
            show();
        }
    }
    public  static synchronized void show(){
        System.out.println(Thread.currentThread().getName()+":"+ticket);
        ticket--;
    }
}
