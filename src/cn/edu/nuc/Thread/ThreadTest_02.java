package cn.edu.nuc.Thread;

    public class ThreadTest_02 {

        public static void main(String[] args) {
            Windows ws_1=new Windows();
            ws_1.start();
            Windows ws_2=new Windows();
            ws_2.start();
            Windows ws_3=new Windows();
            ws_3.start();

        }
    }
    class   Windows extends Thread{
        private static int ticket=100;
        static Object object=new Object();
        public void run(){
            while (ticket<=100&&ticket>2){
                try {
                   sleep(100);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                synchronized (object){

                System.out.println(this.currentThread().getName()+":"+ticket);
                ticket--;
        }
            }
        }
    }

