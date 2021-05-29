package cn.edu.nuc.io;


import java.io.*;

public class IOTest_01 {
    public static void main(String[] args) {
        //创建源
        File src=new File("abc.txt");
        //选择流
        InputStream is;

        {
            try {
                is = new FileInputStream(src);
                //操作
                try {
                   int temp;
                   while((temp=is.read())!=-1){
                       System.out.println((char)temp);
                   }

                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        if (is!=null) {
                            is.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


}
