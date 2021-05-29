package cn.edu.nuc.io;

import java.io.*;

public class IOTest_03 {
    /**
     * 文件字节输出流 outputstream
     */
    public static void main(String[] args) {
        File file=new File("adc.txt");
        OutputStream os=null;
        try {
             os=new FileOutputStream(file,true);//往后面追加写
             String str="I love Study" ;
             byte [] bytes=str.getBytes();//编码
            os.write(bytes,0,str.length());
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
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
