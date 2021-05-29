package cn.edu.nuc.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest_06 {
    /**
     * 文件字符输入流
     * @param 小兜
     */
    public static void main(String[] args) {
        File file=new File("abcd.txt");
        Writer writer = null;
        try {
             writer=new FileWriter(file,true);
            String str="小兜";
            char [] chars=new char[1024];
            chars=str.toCharArray();
            writer.write(chars,0,chars.length);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {if(writer!=null)
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
