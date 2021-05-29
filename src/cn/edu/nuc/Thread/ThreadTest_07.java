package cn.edu.nuc.Thread;

import sun.font.TrueTypeFont;

import static java.lang.Thread.sleep;

public class ThreadTest_07 {
    public static void main(String[] args) {
    Window_07 window_07=new Window_07();
    Thread thread=new Thread(window_07);
    thread.start();
    Thread thread1=new Thread(window_07);
    thread1.start();
    Thread thread2=new Thread(window_07);
    thread2.start();
    }

}
class Window_07 implements Runnable{
    private static int ticket=100;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                notifyAll();
                if(ticket>0){
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                }else {
                    break;
            }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}