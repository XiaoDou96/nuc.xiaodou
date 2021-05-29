package cn.edu.nuc.io;

import java.io.*;

public class IOTest_12 {
    public static void main(String[] args) {
        /**
         * 字节缓冲输出流
         */
        File file=new File("abcde.txt");
        OutputStream os = null;
        try {
             os=new BufferedOutputStream(new FileOutputStream(file));
            String str="the day is 520";
            byte[] bytes=str.getBytes();
            os.write(bytes,0,bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
