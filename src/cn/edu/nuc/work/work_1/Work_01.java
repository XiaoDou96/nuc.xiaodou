package cn.edu.nuc.work.work_1;

import java.util.HashSet;
import java.util.Set;

public class Work_01 {
    public static void main(String[] args) {
        Set<Integer> rams=new HashSet<>();
        while (rams.size()<10){
            rams.add((int)(Math.random()*20));
        }
        System.out.println("请输入你需要的功能：1.增加新的商品，2.修改商品信息，3.根据id编号查询商品，4.查询仓库中所有商品，5.根据编号查询商品品质,6退出系统");
    }
}
