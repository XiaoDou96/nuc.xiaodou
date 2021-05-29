package cn.edu.nuc.io;

import java.io.*;

public class IOTest_13 {
    public static void main(String[] args) {
        /**
         * 字符缓冲输入流
         */
        File file =new File("abc.txt");
        BufferedReader br=null;
        try {
             br=new BufferedReader(new FileReader(file));
            String line=null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
