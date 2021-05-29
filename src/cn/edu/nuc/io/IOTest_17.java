package cn.edu.nuc.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOTest_17 {
    /**
     * 对象流的使用:ObjectInputStream ObjectOutputStream
     * 作用:用于存储和读取基本数据类型或对象的对象流
     * @param args
     */
    public static void main(String[] args)  {
        ObjectOutputStream objectOutputStream=null;
        try { objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File("object.txt")));
            objectOutputStream.writeObject(new String("且行且珍惜"));
            objectOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(objectOutputStream!=null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
