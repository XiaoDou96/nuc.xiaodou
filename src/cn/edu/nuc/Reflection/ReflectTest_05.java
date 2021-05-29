package cn.edu.nuc.Reflection;

public class ReflectTest_05 {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyInstace = (Human) ProxyFactory.getProxyInstace(superMan);
        proxyInstace.getBelief();
        proxyInstace.eat("麻辣烫");
    }
}
