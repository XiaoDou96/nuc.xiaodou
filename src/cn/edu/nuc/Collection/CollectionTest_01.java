package cn.edu.nuc.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest_01 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator <String> iter=list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
