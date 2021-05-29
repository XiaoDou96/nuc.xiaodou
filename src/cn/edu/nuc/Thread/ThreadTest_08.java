package cn.edu.nuc.Thread;

public class ThreadTest_08 {
}
class Bank{
    private Bank(){

    }
    private static Bank instance=null;
    public static Bank getInstance(){
        Object obj=new Object();
        synchronized (obj){
        if(instance==null){
            instance=new Bank();
        }
        return  instance;
    }
    }
}