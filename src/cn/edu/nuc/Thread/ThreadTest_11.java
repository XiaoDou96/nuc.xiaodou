package cn.edu.nuc.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest_11 {
    /**
     * 创建线程的方式三: 实现Callable接口
     * @param args
     */
    public static void main(String[] args) {
    CallThread callThread=new CallThread();
    FutureTask futureTask= new FutureTask(callThread);
    new Thread(futureTask).start();
    try {
            //获得call()方法的返回值
            Object sum=futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class CallThread implements Callable{

    @Override
    public Object call() throws Exception {
            int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum +=i;
            }
        }
        return sum;
    }
}
