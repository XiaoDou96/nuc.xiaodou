package cn.edu.nuc.io;

import java.io.File;

/**
 *创建目录
 */
public class DirDemo {
    public static void main(String[] args) {
        File file =new File("png");
        Boolean flag=file.mkdirs();
        File file1 =new File("C:/Users/40846/IdeaProjects/test");
        printName(file1,0);
    }
    private static void printName(File file,int deep){
        for(int i=0;i<deep;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file==null||!file.exists()){
            return;
        }else if(file.isDirectory()){
            for(File s:file.listFiles()){
                printName(s,deep+1);

            }
        }
    }


}
