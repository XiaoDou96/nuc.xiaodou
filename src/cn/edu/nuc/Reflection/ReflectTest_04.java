package cn.edu.nuc.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest_04 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class <Person> clazz=Person.class;
        Person p=clazz.newInstance();
        Method method= clazz.getDeclaredMethod("show");
        method.setAccessible(true);
        method.invoke(p,null);
    }
}
