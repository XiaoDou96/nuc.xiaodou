package cn.edu.nuc.Singlecase;


public class SingleTest_01 {
    /**
    * 饿汉单例模式
    */
    public static void main(String[] args) {
        World world1=World.getInstace();
        World world2=World.getInstace();
        System.out.println(world1==world2);
    }
}
class World{
    private World(){

    }
    private static World Instace=new World();
    public  static World getInstace(){
        return Instace;
    }
}