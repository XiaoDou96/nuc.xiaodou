package cn.edu.nuc.Reflection;


import java.lang.reflect.Proxy;


public class ProxyFactory {
    public static Object getProxyInstace(Object obj){
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces() ,myInvocationHandler);
    }
}
