package cn.edu.nuc.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest_14 {
    public static void main(String[] args) {
        /**
         * 字符缓冲输出流
         */
        File file=new File("abcdef.txt");
        BufferedWriter bw = null;
        try {
            bw=new BufferedWriter(new FileWriter(file));
            bw.write("l am man");
            bw.newLine();
            bw.write("xiaodou!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
