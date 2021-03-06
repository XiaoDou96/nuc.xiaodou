package cn.edu.nuc.io;

import java.io.*;

public class IOTest_15 {
    public static void main(String[] args) {
        /**
         * 字符缓冲流-拷贝
         */
        Copy("abc.txt","a.txt");
    }
    public static void Copy(String srcPath,String destPath){
        File src=new File(srcPath);
        File dest=new File(destPath);
        try(BufferedReader br=new BufferedReader(new FileReader(src));BufferedWriter bw=new BufferedWriter(new FileWriter(dest))) {
        String line=null;
        while((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
