package cn.edu.nuc.Reflection;

public class ReflectTest_02 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Person> clazz=Person.class;
        /*
        newInstance():调用此方法，创建对应类的对象
         */
        Person person=clazz.newInstance();
    }
}
