package cn.edu.nuc.Reflection;

public class ReflectTest_01 {

    public static void main(String[] args) throws ClassNotFoundException {
        //方式一：调用运行时的属性
        Class<Person> clazz1=Person.class;
        //Class clazz=Person.class;
        //方式二：调用运行类的getClass()方法
        Person person=new Person();
        Class clazz2=person.getClass();
        //方法三：直接加载类的实例
        Class clazz3=Class.forName("cn.edu.nuc.Reflection");
        //方式四：使用类的加载器
        ClassLoader classLoader=ReflectTest_01.class.getClassLoader();
        Class clazz4= classLoader.loadClass("cn.edu.nuc.Reflection");

    }
}
