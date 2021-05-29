package cn.edu.nuc.io;


import java.io.*;

public class IOTest_05 {
    public static void main(String[] args) {
        /**
         * 文件字符流
         *
         */
         File file =new File("abc.txt");
        Reader reader = null;
         try {
            reader=new FileReader(file);
            char [] bytes=new char[1024];
            int len=-1;
            while((len=reader.read(bytes))!=-1){
                String str=new String(bytes,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
             e.printStackTrace();
         }finally {
             try {
                 reader.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
    }
}
