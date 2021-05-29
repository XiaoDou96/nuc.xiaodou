package cn.edu.nuc.io;

import java.io.*;


public class IOTest_02 {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        InputStream is=null;
        try {
            is=new FileInputStream(file);
            byte[] flush=new byte[1024];//缓冲容器
            int len=-1;

                try {
                    if (((len=is.read(flush))!=-1)){
                        String string=new String(flush,0,len);
                        System.out.println(string);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
