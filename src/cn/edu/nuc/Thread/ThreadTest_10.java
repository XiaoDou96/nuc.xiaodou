package cn.edu.nuc.Thread;

public class ThreadTest_10 {
    public static void main(String[] args) {
        Banks banks=new Banks();
        Thread s1=new Thread(banks);
        s1.start();
        Thread s2=new Thread(banks);
        s2.start();
    }

}
class Banks implements Runnable{
    private static int sca=30000000;
    @Override
    public void run() {
        while (sca>0){
            synchronized (this) {
                sca = sca - 1000;
                System.out.println(Thread.currentThread().getName() + sca);
            }
        }

    }
}
