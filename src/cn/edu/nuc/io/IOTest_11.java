package cn.edu.nuc.io;

import java.io.*;

public class IOTest_11 {
    public static void main(String[] args) {
        /**
         * 字节缓冲输入流
         */
        File file=new File("abc.txt");
        InputStream is =null;
        try {
           is=new BufferedInputStream(new FileInputStream(file));
           byte []bytes=new byte[1024];
           int len=-1;
           while((len=is.read(bytes))!=-1){
               String str=new String(bytes,0,len);
               System.out.println(str);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
