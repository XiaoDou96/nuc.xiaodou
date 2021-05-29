package cn.edu.nuc.work.work_1;

import java.util.Scanner;

public class Work_04 {
    public static void main(String[] args) {
        System.out.println("欢迎来到*****，请输入您的账号:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        while (name==null&&name.length()<6){
            System.out.println("请输入正确的账号格式");
        }
        String password=scanner.next();
        while (password!="521"){
            System.out.println("请输入正确的密码");
        }
    }
}
