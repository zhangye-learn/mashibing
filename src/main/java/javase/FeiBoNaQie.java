package javase;

import java.util.Scanner;

public class FeiBoNaQie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打印个数：");
        int count = sc.nextInt();
        int x = 1;
        int y = 1;
        int z = 0;
        for (int i=1;i<=count;i++){
             if (i==1||i==2){
                 System.out.println(1 + "\t");
             }else{
                 z = x + y;
                 x = y;
                 y = z;
                 System.out.println(z +"\t");
             }
        }

    }
}
