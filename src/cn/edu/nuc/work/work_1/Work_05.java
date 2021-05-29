package cn.edu.nuc.work.work_1;


import java.util.Scanner;

public class Work_05 {
    public static void main(String[] args) {
        int []ids=new  int[5];
        String []names=new String[5];
        String []qualities=new String[5];
        String []prices=new String[5];

        boolean T=true;
        while (T) {
            System.out.println("请输入你需要的功能：1.增加新的商品，2.修改商品信息，3.根据id编号查询商品，4.查询仓库中所有商品，5.根据编号查询商品品质,6退出系统");
            Scanner sc=new Scanner(System.in);
            switch (sc.nextLine()) {
                case "1":
                    for(int i=0;i<5;i++){
                    System.out.println("商品id：");
                    int id_1=sc.nextInt();
                    System.out.println("商品名字：");
                    String name_1=sc.next();
                    System.out.println("商品质量：1.好,2.良,3.不合格");
                    String quality_1=null;
                    switch (sc.nextInt()){
                        case 1:
                            quality_1="好";
                            break;
                        case 2:
                            quality_1="良";
                            break;
                        case 3:
                            quality_1="不合格";
                            break;
                    }
                    if(quality_1==null){
                        System.out.println("输入正确数字");
                    }
                    System.out.println("商品价格");
                    String price_1=sc.next();
                    ids[i]=id_1;
                    names[i]=name_1;
                    qualities[i]=quality_1;
                    prices[i]=price_1;
                    }
                    break;
                case "2":
                    System.out.println("请输入你需要修改的商品编号:");
                    int id_2=sc.nextInt();
                    int lenth=-1;
                    for(int i=1;i<5;i++){
                        if(id_2==ids[i]){
                            lenth=i;
                            break;
                        }
                    }
                    if(lenth==-1){
                        System.out.println("没有你需要的商品");
                    }else {
                        System.out.println("商品名字：");
                        String name_2=sc.next();
                        System.out.println("商品质量：1.好,2.良,3.不合格");
                        String quality_2=null;
                        switch (sc.nextInt()){
                            case 1:
                                quality_2="好";
                                break;
                            case 2:
                                quality_2="良";
                                break;
                            case 3:
                                quality_2="不合格";
                                break;
                        }
                        if(quality_2==null){
                            System.out.println("输入正确数字");
                        }
                        System.out.println("商品价格");
                        String price_2=sc.next();
                        names[lenth]=name_2;
                        qualities[lenth]=quality_2;
                        prices[lenth]=price_2;
                    }

                    break;
                case "3":
                    System.out.println("请输入你查询的商品的id:");
                    int id_3=sc.nextInt();
                    int len=-1;
                    for(int i=1;i<5;i++){
                        if(id_3==ids[i]){
                            len=i;
                            break;
                        }
                    }
                    if(len==-1){
                        System.out.println("没有你需要的商品");
                    }else {
                        System.out.println("id:"+ids[len]);
                        System.out.println("name"+names[len]);
                        System.out.println("qualities"+qualities[len]);
                        System.out.println("prices"+prices[len]);
                    }

                    break;
                case "4":
                    for(int i=0;i<5;i++){
                        System.out.println("第"+i+"个商品:");
                        System.out.println("id:"+ids[i]);
                        System.out.println("name"+names[i]);
                        System.out.println("qualities"+qualities[i]);
                        System.out.println("prices"+prices[i]);

                    }

                    break;

                case "5":
                    System.out.println("请输入你查询的商品的id:");
                    int id_5=sc.nextInt();
                    int l=-1;
                    for(int i=1;i<5;i++){
                        if(id_5==ids[i]){
                            len=i;
                            break;
                        }
                    }
                    if(l==-1){
                        System.out.println("没有你需要的商品");
                    }else {
                        System.out.println("商品质量：1.好,2.良,3.不合格");
                        String quality_5=null;
                        switch (sc.nextInt()){
                            case 1:
                                quality_5="好";
                                break;
                            case 2:
                                quality_5="良";
                                break;
                            case 3:
                                quality_5="不合格";
                                break;
                        }
                        if(quality_5==null){
                            System.out.println("输入正确数字");
                        }
                        qualities[l]=quality_5;
                    }
                    break;
                case "6":
                    T=false;
                    break;
                default:
                    System.out.println("请输入正确数字");
                    break;

            }
        }


    }
}
