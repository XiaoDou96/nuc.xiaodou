package cn.edu.nuc.work.work_1;

public class Work_02 {
    public static void main(String[] args) {
        int [] ints=new int[5];
        for (int i=0;i<5;i++){
            ints [i]=(int)(Math.random()*50)+30;
            System.out.println(ints[i]);
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){

                if(ints[j]<ints[i]){
                    int temp=ints[j];
                    ints[j]=ints[i];
                    ints[i]=temp;
                }

            }
        }
        for(int i=0;i<5;i++){
            System.out.println(ints[i]);
        }
    }
}
