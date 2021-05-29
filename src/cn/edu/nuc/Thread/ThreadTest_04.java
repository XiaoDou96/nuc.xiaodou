package cn.edu.nuc.Thread;

import static java.lang.Thread.sleep;

public class ThreadTest_04 {
    public static void main(String[] args) {
        Window window=new Window();
        Thread thread_1=new Thread(window);
        thread_1.start();
        Thread thread=new Thread(window);
        thread.start();
        Thread thread_2=new Thread(window);
        thread_2.start();
    }
}
 class Window implements Runnable{
    private static int ticket=1000;

    Object object=new Object();
    @Override
    public void run(){

         while(ticket<=1000&&ticket>2){
             synchronized (object){
                 try {
                     sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             System.out.println(Thread.currentThread().getName()+":"+ticket);
             ticket--;
         }
        }
     }
}
