package cn.edu.nuc.io;

import java.io.*;
import java.util.stream.IntStream;

public class IOTest_04_CopyFile {
    public static void main(String[] args) {
        /**
         * 文件的拷贝 字节流输入和输出
         */
        File file=new File("abc.txt");
        File tofile=new File("abcd.txt");
        InputStream is = null;
        OutputStream os = null;
        try{
        is=new FileInputStream(file);
        os=new FileOutputStream(tofile);
        byte []bytes=new byte[1024];
        int len=-1;
        while((len=is.read(bytes))!=-1){
                os.write(bytes,0,len);
        }os.flush();
        }catch (IOException e){
            e.printStackTrace();

        }finally {
            try {
                os.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
