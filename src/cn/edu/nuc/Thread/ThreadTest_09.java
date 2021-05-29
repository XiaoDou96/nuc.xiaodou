package cn.edu.nuc.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest_09 {
    public static void main(String[] args) {
        Window_09 window=new Window_09();
        Thread thread1=new Thread(window);
        thread1.start();
        Thread thread=new Thread(window);
        thread.start();
        Thread thread2=new Thread(window);
        thread2.start();
    }

}
class Window_09 implements Runnable{
     private static int ticket=1000;
    private ReentrantLock lock=new ReentrantLock();
     @Override
    public void run() {

             while(ticket>0){
                 try {
                    lock.lock();
                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                 }
                 finally {
                     lock.unlock();
                 }
             }
    }
}