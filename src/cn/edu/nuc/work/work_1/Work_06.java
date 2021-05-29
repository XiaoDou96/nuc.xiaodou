package cn.edu.nuc.work.work_1;


import java.util.Scanner;

public class Work_06 {
    public static void main(String[] args) {
        Commodity []commodities=new Commodity[4];

        System.out.println("--------------欢迎来到**仓库--------------");
        boolean T=true;
        while (T) {
            System.out.println("请输入你需要的功能：1.增加新的商品，2.修改商品信息，3.根据id编号查询商品，4.查询仓库中所有商品，5.根据编号查询商品品质,6退出系统");
            Scanner sc=new Scanner(System.in);
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("商品id：");
                    int id=sc.nextInt();
                    System.out.println("商品名字：");
                    String name=sc.next();
                    System.out.println("商品质量：1.好,2.良,3.不合格");
                    String quality=null;
                    switch (sc.nextInt()){
                        case 1:
                            quality="好";
                            break;
                        case 2:
                             quality="良";
                            break;
                        case 3:
                            quality="不合格";
                            break;
                    }
                    if(quality==null){
                        System.out.println("输入正确数字");
                    }
                    System.out.println("商品价格");
                    String price=sc.next();
                    Commodity commodity=new Commodity(id,name,quality,price);
                    if(add(commodity,commodities)){
                        System.out.println("添加成功，返回主页面");
                    }else {
                        System.out.println("添加失败");
                    }
                    break;
                case "2":
                    System.out.println("请输入要修改的商品编号：");
                    int id_2=sc.nextInt();
                    Commodity commodity_2=selcetOne(id_2,commodities);
                    if(commodity_2!=null){
                        System.out.println("请选择要修改的信息:1.name2.quality3.price");
                        switch (sc.nextInt()){
                            case 1:
                                System.out.println("请输入：");
                                commodity_2.setName(sc.next());
                                break;
                            case 2:
                                System.out.println("请输入：");
                                commodity_2.setQuality(sc.next());
                                break;
                            case 3:
                                System.out.println("请输入：");
                                commodity_2.setPrice(sc.next());
                                break;
                        }
                    }else {
                        System.out.println("输入商品不存在" );
                    }

                    break;
                case "3":
                    System.out.println("请输入商品编号：");
                    int id_3=sc.nextInt();
                    Commodity commodity_3 =selcetOne(id_3,commodities);
                    System.out.println("id"+":"+commodity_3.getId());
                    System.out.println("name"+":"+commodity_3.getName());
                    System.out.println("quality"+":"+commodity_3.getQuality());
                    System.out.println("price"+":"+commodity_3.getPrice());
                    break;
                case "4":

                    selcetAll(commodities);
                    break;

                case "5":
                    System.out.println("请输入商品编号：");
                    int id_5=sc.nextInt();
                    Commodity commodity_5=selcetOne(id_5,commodities);
                    System.out.println("该商品的质量:"+":"+commodity_5.getQuality());
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

    private static boolean  add(Commodity commodity,Commodity []commodities){
        if(nullIsExist(commodities)==-1){
            return false;
        }else {
            commodities[nullIsExist(commodities)]=commodity;
            return true;
        }

    }

    private static int nullIsExist(Commodity []commodities) {
        for (int i = 0; i < 4; i++) {
            if((commodities[i])==null){
                return i;
            }
        }
        return -1;
    }

    private static void selcetAll(Commodity[] commodities){
        for(int z=0;z<4;z++){
            if(commodities[z]!=null){
                System.out.println("id"+":"+commodities[z].getId());
                System.out.println("name"+":"+commodities[z].getName());
                System.out.println("quality"+":"+commodities[z].getQuality());
                System.out.println("price"+":"+commodities[z].getPrice());
            }
        }
    }
    private static Commodity selcetOne(int id,Commodity []commodities){
        for(int i=0;i<commodities.length;i++){
            if(commodities[i].getId()==id){
                return commodities[i];
            }
        }return null;
    }
}

