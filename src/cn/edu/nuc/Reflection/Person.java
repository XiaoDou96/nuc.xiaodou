package cn.edu.nuc.Reflection;

public class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
    public void show(){
        System.out.println("I am fishman");
    }
    private void see(){
        System.out.println("不准偷看。");
    }
}
