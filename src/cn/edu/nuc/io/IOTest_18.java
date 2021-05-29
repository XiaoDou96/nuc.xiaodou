package cn.edu.nuc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOTest_18 {
    public static void main(String[] args) {

        ObjectInputStream objectInputStream= null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File("object.txt")));
            Object obj= null;
            try {
                obj = objectInputStream.readObject();
                System.out.println((String) obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
