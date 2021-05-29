package cn.edu.nuc.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOTest_08 {
    public static void main(String[] args) {
        /**
         * 字节数组输入流
         */
        //创建源
        byte []bytes="I am XiaoDou".getBytes();
        InputStream is=new ByteArrayInputStream(bytes);
        try {
            byte [] bytes1=new byte[50];

        int len=-1;
        while((len=is.read(bytes1))!=-1){
            String str=new String(bytes,0,len);
            System.out.println(str);
        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
