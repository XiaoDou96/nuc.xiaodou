package cn.edu.nuc.Reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object obj;
    public void bind(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object retrunValue =method.invoke(obj,args);
        return retrunValue;
    }
}
