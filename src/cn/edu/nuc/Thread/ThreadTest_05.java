package cn.edu.nuc.Thread;




public class ThreadTest_05 {
    public static void main(String[] args) {
        Window_1 window_1=new Window_1();
        Window_1 window_11=new Window_1();
        Window_1 window_12=new Window_1();
        window_1.start();
        window_11.start();
        window_12.start();
    }
}
class Window_1 extends Thread {
    public static int Ticket=100;
    public  void run(){

     while (0<Ticket&&Ticket<=100){
         show();
     }

 }
    public synchronized void show(){
        System.out.println(Window_1.currentThread().getName()+":"+ Ticket);
        Ticket--;
    }
}
