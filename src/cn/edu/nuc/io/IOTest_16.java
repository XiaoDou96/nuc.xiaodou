package cn.edu.nuc.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class IOTest_16 {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(
            new InputStreamReader(new URL("https://www.baidu.com").openStream(),"UTF-8") );
            BufferedWriter bw=new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("xiaoodou.txt"),"UTF-8"));
        ){String line=null;
        while((line=br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
        }
            bw.flush();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
