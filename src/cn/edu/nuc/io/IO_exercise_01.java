package cn.edu.nuc.io;

import java.io.*;

public class IO_exercise_01 {
    public static void main(String[] args) {
        File file =new File("abc.txt");
        InputStream is = null;
        try {
            is= new FileInputStream(file);
            int temp;

                try {
                    while ((temp=is.read())!=-1) {System.out.println((char)temp);}
                } catch (IOException e) {
                    e.printStackTrace();
                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
