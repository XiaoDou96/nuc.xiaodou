package cn.edu.nuc.io;

import java.io.File;

public class PathDemo {
    public static void main(String[] args) {
        String path="C:\\Users\\40846\\IdeaProjects\\test/5762378abc7befcc2da27866f05018cd.jpeg";
        File file=new File(path);
        System.out.println(file.getName());
    }
}
