package cn.edu.nuc.io;

import java.io.*;

public class IOTest_10 {
    public static void main(String[] args) {
        /**
         * 1.文件放入字节数组中
         * 2.用字节数组写出文件
         */
        File file=new File("123456.png");
        String str=fileToByteArray(file);
        byte[] bytes=str.getBytes();
        System.out.println(bytes.length);
    }
    //文件转化成字节数组
    private static String fileToByteArray(File file){
        byte[] bytes_1=null;
        InputStream is = null;
        ByteArrayOutputStream os_1=null;
        String str=null;
        try {
            is=new FileInputStream(file);
            os_1=new ByteArrayOutputStream();
            byte [] bytes=new byte[1024];
            int len=-1;
            while ((len=is.read(bytes))!=-1){
                os_1.write(bytes,0,len);
                bytes_1=os_1.toByteArray();
                str=new String(bytes_1,0,bytes_1.length);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return str;
    }
    //字符数组写出文件
    private void byteArrayToFile(){

    }
}
