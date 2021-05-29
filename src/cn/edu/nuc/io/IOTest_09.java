package cn.edu.nuc.io;

import java.io.ByteArrayOutputStream;

public class IOTest_09 {
    public static void main(String[] args) {
        byte [] dest=null;
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        byte []bytes=new byte[1024];
        String str="l am xiaodou";
        bytes=str.getBytes();//字符串-->字节数组 （编码）
        bos.write(bytes,0,str.length());
        dest=bos.toByteArray();
        String strs=new String(dest,0,dest.length);
        System.out.println(strs);
    }
}
