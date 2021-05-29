package cn.edu.nuc.Reflection;

import java.lang.reflect.Field;

public class ReflectTest_03 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class <Person>clazz=Person.class;
        Person p=clazz.newInstance();
        Field id=clazz.getDeclaredField("age");
        id.setAccessible(true);
        id.set(p,"xiaodou");
        Person p1=clazz.newInstance();
        System.out.println(id.get(p));

    }
}
