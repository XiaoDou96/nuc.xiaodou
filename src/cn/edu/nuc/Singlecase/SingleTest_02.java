package cn.edu.nuc.Singlecase;

import sun.security.jca.GetInstance;

public class SingleTest_02 {
    /**懒汉式单例模式
     *
     * @param args
     */
    public static void main(String[] args) {
        Order order1=Order.getInstance();
        Order order2=Order.getInstance();
        System.out.println(order1==order2);
    }
}
class Order{
    private Order(){

    }
    private static Order instance=null;

    public static Order getInstance(){
        if(instance!=null){
            instance=new Order();
        }
        return instance;
    }

}