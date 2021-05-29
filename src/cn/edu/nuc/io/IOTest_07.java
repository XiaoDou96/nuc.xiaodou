package cn.edu.nuc.io;

import java.io.*;

public class IOTest_07 {
    public static void main(String[] args) {
        File file=new File("abcd.txt");
        File tofile =new File("abcde.txt");
        Reader reader=null;
        Writer writer=null;
        try {
            reader=new FileReader(file);
            writer=new FileWriter(tofile);
            char []chars=new char[1024];
            int len=-1;
            while ((len=reader.read(chars))!=-1){
                writer.write(chars,0,len);
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
